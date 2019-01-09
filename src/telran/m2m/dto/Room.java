package telran.m2m.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Data Transfer Object for the Room in the monitoring and control system for buildings
 * made for generation of imitation model to test the functionality of microservices project
 *
 * @author Andrey Lavrinenko
 */
public class Room {

    /**
     * Identification number of room object
     */
    private int idRoom;

    /**
     * Name of room object, e.g. "Kitchen on the 7'th floor"
     */
    private String nameRoom;

    /**
     * Volume of the room in cubic miters, needed for computational fluid dynamics calculations
     */
    private double volumeRoomM3;

    /**
     * Windows' parameters presented in the room
     */
    private ArrayList<Window> windows;

    /**
     * Heaters' (all heating devices) parameters in the room
     */
    private ArrayList<Heater> heaters;

    /**
     * Coolers' (all cooling devices) parameters in the room
     */
    private ArrayList<Cooler> coolers;

    /**
     * All lightning devices and objects influencing on lumen in the room, including sun and moon
     */
    private ArrayList<Light> lights;

    /**
     * Persons' count in the room
     */
    private int persons;

    /**
     * Animal's count in the room
     */
    private int animals;

    /**
     * Central air conditioner in the room, usually in big offices
     */
    private AirConditioner airConditioner;

    /**
     * Current internal temperature of the room, in degrees Celcius
     */
    private double internalTemperatureC;

    /**
     * Current outside temperature, in degrees Celsius
     */
    private double outsideTemperatureC;

    /**
     * Current lighting intensity in the room, in lumen
     */
    private double lightLumen;

    /**
     * Current electricity consumption in the room, in killowatt per hour
     */
    private double electricityKwtPerHour;

    /**
     * Current oxygen percent in the air based on volume calculations,
     * e.g. normal value is 20.947%
     */
    private double oxygenPercentOfVolume;

    /**
     * Current Carbon Dioxide CO2 percent in the air based on volume calculations,
     * e.g. normal value is 0.033%%
     */
    private double CO2PercentOfVolume;

    /**
     * Boolean flag determining if smoke is presented in the room
     */
    private boolean isSmoke;

    /**
     * Boolean flag determining if emergency evacuation room control alarm is activated
     */
    private boolean isAlarm;

    @JsonCreator
    public Room(@JsonProperty("idRoom") int idRoom,
                @JsonProperty("nameRoom") String nameRoom,
                @JsonProperty("volumeRoomM3") double volumeRoomM3,
                @JsonProperty("windows") ArrayList<Window> windows,
                @JsonProperty("heaters") ArrayList<Heater> heaters,
                @JsonProperty("coolers") ArrayList<Cooler> coolers,
                @JsonProperty("lights") ArrayList<Light> lights,
                @JsonProperty("persons") int persons,
                @JsonProperty("animals") int animals,
                @JsonProperty("airConditioner") AirConditioner airConditioner,
                @JsonProperty("internalTemperatureC") double internalTemperatureC,
                @JsonProperty("outsideTemperatureC") double outsideTemperatureC,
                @JsonProperty("lightLumen") double lightLumen,
                @JsonProperty("electricityKwtPerHour") double electricityKwtPerHour,
                @JsonProperty("oxygenPercentOfVolume") double oxygenPercentOfVolume,
                @JsonProperty("CO2PercentOfVolume") double CO2PercentOfVolume,
                @JsonProperty("isSmoke") boolean isSmoke,
                @JsonProperty("isAlarm") boolean isAlarm) {
        this.idRoom = idRoom;
        this.nameRoom = nameRoom;
        this.volumeRoomM3 = volumeRoomM3;
        this.windows = windows;
        this.heaters = heaters;
        this.coolers = coolers;
        this.lights = lights;
        this.persons = persons;
        this.animals = animals;
        this.airConditioner = airConditioner;
        this.internalTemperatureC = internalTemperatureC;
        this.outsideTemperatureC = outsideTemperatureC;
        this.lightLumen = lightLumen;
        this.electricityKwtPerHour = electricityKwtPerHour;
        this.oxygenPercentOfVolume = oxygenPercentOfVolume;
        this.CO2PercentOfVolume = CO2PercentOfVolume;
        this.isSmoke = isSmoke;
        this.isAlarm = isAlarm;
    }

//    public Room(int newRoomId, String newRoomName, double newVolumeRoomM3,
////                ArrayList<Window> newRoomWindows, ArrayList<Heater> newRoomHeaters, ArrayList<Cooler> newRoomCoolers, ArrayList<Light> newRoomLights,
//                int newRoomPersons, int newRoomAnimals, AirConditioner newRoomAirConditioner, double newRoomInternalTemperatureC, double newRoomOutsideTemperatureC, double newRoomElectricityKwtPerHour, double newRoomOxygenPercentOfVolume, double newRoomCO2PercentOfVolume, boolean newRoomIsSmoke, boolean newRoomIsAlarm) {
//    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public double getVolumeRoomM3() {
        return volumeRoomM3;
    }

    public void setVolumeRoomM3(double volumeRoomM3) {
        this.volumeRoomM3 = volumeRoomM3;
    }

    public ArrayList<Window> getWindows() {
        return windows;
    }

    public void setWindows(ArrayList<Window> windows) {
        this.windows = windows;
    }

    public ArrayList<Heater> getHeaters() {
        return heaters;
    }

    public void setHeaters(ArrayList<Heater> heaters) {
        this.heaters = heaters;
    }

    public ArrayList<Cooler> getCoolers() {
        return coolers;
    }

    public void setCoolers(ArrayList<Cooler> coolers) {
        this.coolers = coolers;
    }

    public ArrayList<Light> getLights() {
        return lights;
    }

    public void setLights(ArrayList<Light> lights) {
        this.lights = lights;
    }

    public int getPersonsCount() {
        return persons;
    }

    public void setPersonsCount(int persons) {
        this.persons = persons;
    }


    public int getAnimalsCount() {
        return animals;
    }

    public void setAnimalsCount(int animals) {
        this.animals = animals;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public double getInternalTemperatureC() {
        return internalTemperatureC; //TODO
    }

    public void setInternalTemperatureC(double internalTemperatureC) {
        this.internalTemperatureC = internalTemperatureC;
    }

    public double getOutsideTemperatureC() {
        return outsideTemperatureC;
    }

    public void setOutsideTemperatureC(double outsideTemperatureC) {
        this.outsideTemperatureC = outsideTemperatureC;
    }

    public double getLightLumen() {
        return lightLumen;
    }

    public void setLightLumen(double lightLumen) {
        this.lightLumen = lightLumen;
    }

    public double getElectricityKwtPerHour() {
        return electricityKwtPerHour;
    }

    public void setElectricityKwtPerHour(double electricityKwtPerHour) {
        this.electricityKwtPerHour = electricityKwtPerHour;
    }

    public double getOxygenPercentOfVolume() {
        return oxygenPercentOfVolume;
    }

    public void setOxygenPercentOfVolume(double oxygenPercentOfVolume) {
        this.oxygenPercentOfVolume = oxygenPercentOfVolume;
    }

    public double getCO2PercentOfVolume() {
        return CO2PercentOfVolume;
    }

    public void setCO2PercentOfVolume(double CO2PercentOfVolume) {
        this.CO2PercentOfVolume = CO2PercentOfVolume;
    }

    public boolean isSmoke() {
        return isSmoke;
    }

    public void setSmoke(boolean smoke) {
        isSmoke = smoke;
    }

    public boolean isAlarm() {
        return isAlarm;
    }

    public void setAlarm(boolean alarm) {
        isAlarm = alarm;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idRoom=" + idRoom +
                ", nameRoom='" + nameRoom + '\'' +
                ", volumeRoomM3=" + volumeRoomM3 +
                ", windows=" + windows +
                ", heaters=" + heaters +
                ", coolers=" + coolers +
                ", lights=" + lights +
                ", persons=" + persons +
                ", animals=" + animals +
                ", airConditioner=" + airConditioner +
                ", internalTemperatureC=" + internalTemperatureC +
                ", outsideTemperatureC=" + outsideTemperatureC +
                ", lightLumen=" + lightLumen +
                ", electricityKwtPerHour=" + electricityKwtPerHour +
                ", oxygenPercentOfVolume=" + oxygenPercentOfVolume +
                ", CO2PercentOfVolume=" + CO2PercentOfVolume +
                ", isSmoke=" + isSmoke +
                ", isAlarm=" + isAlarm +
                '}';
    }
}
