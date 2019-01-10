package telran.m2m.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Service;
import telran.m2m.Repo.RoomMongoRepository;
import telran.m2m.dto.*;

@EnableBinding(Sink.class)
@Service
public class AvgSensorService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    RoomMongoRepository repository;
    ObjectMapper mapper = new ObjectMapper();
    long timestamp = System.currentTimeMillis();
    @Value("${avg_period:5000}")
    long avgPeriod;
    public HashMap<Integer, List<RoomData>> roomStates = new HashMap<>();

    @StreamListener(Sink.INPUT)
    public void getRoomState(String jsonSensor) throws IOException {

        if (System.currentTimeMillis() - timestamp > avgPeriod &&
                !roomStates.isEmpty()) {
            avgProcessing();
        }
        RoomData room = mapper.readValue(jsonSensor, RoomData.class);
        addToMap(room);

    }

    private void addToMap(RoomData room){
        List<RoomData> rooms = new ArrayList<>();
        rooms.add(room);
        roomStates.putIfAbsent(room.getRoom().getIdRoom(), rooms);
    }


    private void avgProcessing() {

        HashMap<Integer, RoomData> res = new HashMap<>();
        roomStates.forEach((k, v) -> res.putIfAbsent(k, getAvg(v)));
        roomStates.clear();
        res.forEach((k, v) -> repository.save(v));
        timestamp = System.currentTimeMillis();

    }

    private RoomData getAvg(List<RoomData> v) {

        //calculate average values of all parameters
        /*
        internalTemperatureC
        outsideTemperatureC
        lightLumen
        electricityKwtPerHour
        oxygenPercentOfVolume
        CO2PercentOfVolume
        */

        double avgInternalTemp = v.stream().mapToDouble(x->x.getRoom().getInternalTemperatureC()).average().getAsDouble();
        double avgExternalTemp = v.stream().mapToDouble(x->x.getRoom().getOutsideTemperatureC()).average().getAsDouble();
        double avgCO2Percent = v.stream().mapToDouble(x->x.getRoom().getCO2PercentOfVolume()).average().getAsDouble();
        double avgElectricityKwtPerHour = v.stream().mapToDouble(x->x.getRoom().getElectricityKwtPerHour()).average().getAsDouble();
        double avgLightLumen = v.stream().mapToDouble(x->x.getRoom().getLightLumen()).average().getAsDouble();
        double avgOxygenPercentOfVolume = v.stream().mapToDouble(x->x.getRoom().getOxygenPercentOfVolume()).average().getAsDouble();
        RoomData r = v.get(0);
        r.getRoom().setCO2PercentOfVolume(avgCO2Percent);
        r.getRoom().setInternalTemperatureC(avgInternalTemp);
        r.getRoom().setOutsideTemperatureC(avgExternalTemp);
        r.getRoom().setLightLumen(avgLightLumen);
        r.getRoom().setElectricityKwtPerHour(avgElectricityKwtPerHour);
        r.getRoom().setOxygenPercentOfVolume(avgOxygenPercentOfVolume);
        return r;
        }
}
