package test;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import telran.m2m.dto.Room;
import telran.m2m.dto.RoomData;
import telran.m2m.service.AvgSensorService;

import java.io.IOException;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootApplication
public class AvgSensorAppTest {
    ConfigurableApplicationContext ctx;
    AvgSensorService service;
//    RoomMongoRepository repository;
    RoomData roomDataExp;
    RoomData roomData50;
    RoomData roomData100;
    Room roomExp;
    Room room50;
    Room room100;


    @BeforeEach
    public void setUp(){
        ctx     = SpringApplication.run(AvgSensorAppTest.class);
        service = ctx.getBean(AvgSensorService.class);
        createRoomStates();

    }

    private void createRoomStates() {
        roomData50 = new RoomData();
        room50 = new Room();
        room50.setIdRoom(10);
        room50.setOxygenPercentOfVolume(30);
        room50.setLightLumen(30);
        room50.setOutsideTemperatureC(30);
        room50.setCO2PercentOfVolume(30);
        room50.setInternalTemperatureC(30);
        room50.setOutsideTemperatureC(30);
        roomData50.setRoom(room50);
        roomData50.id=1;
        roomData50.setTimestamp(50);

        roomData100 = new RoomData();
        room100 = new Room();
        room100.setIdRoom(10);
        room100.setOxygenPercentOfVolume(50);
        room100.setLightLumen(50);
        room100.setOutsideTemperatureC(50);
        room100.setCO2PercentOfVolume(50);
        room100.setInternalTemperatureC(50);
        room100.setOutsideTemperatureC(50);
        roomData100.setRoom(room100);
        roomData100.id=2;
        roomData100.setTimestamp(100);

        roomDataExp = new RoomData();
        roomExp = new Room();
        roomExp.setIdRoom(10);
        roomExp.setOxygenPercentOfVolume(40);
        roomExp.setLightLumen(40);
        roomExp.setOutsideTemperatureC(40);
        roomExp.setCO2PercentOfVolume(40);
        roomExp.setInternalTemperatureC(40);
        roomExp.setOutsideTemperatureC(40);
        roomDataExp.setRoom(room50);
        roomDataExp.id=3;
        roomDataExp.setTimestamp(200);
    }

    @Test
    public void AvgTests() {
        ObjectMapper mapper = new ObjectMapper();
//        service.roomStates.put(roomDataExp.id, Arrays.asList(roomDataExp));
        try {
            String data50 = mapper.writeValueAsString(roomData50);
            String data100 = mapper.writeValueAsString(roomData100);
            try {
                service.getRoomState(data50);
                service.getRoomState(data100);
                System.out.println(service.roomStates);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String data50 = null;
        try {
            data50 = mapper.writeValueAsString(roomData50);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        try {
            service.getRoomState(data50);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(1, service.roomStates.values().size());
    }


}
