package telran.m2m.dto;

import java.util.ArrayList;

/**
 * Data Transfer Object for the Room in the monitoring and control system for buildings
 * made for generation of imitation model to test the functionality of microservices project
 * @author Andrey Lavrinenko
 */
public class RoomMongoDB {

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
     * Minimum room temperature in degrees Celsius based on customer's requirements,
     * usually meant in conditions without people and animals,
     * e.g. should be higher than 10 degrees Celsius for rooms with water heating
     */
    private double minRoomTemperatureC;

    /**
     * Maximum room temperature in degrees Celsius based on customer's requirements,
     * usually meant in conditions without people and animals,
     * e.g. should be lower than 40 degrees Celsius for rooms when people and animals
     * can come in the nearest feature
     */
    private double maxRoomTemperatureC;

    /**
     * Boolean flag determining if smoke is presented in the room
     */
    private boolean isSmoke;

    /**
     * Boolean flag determining if emergency evacuation room control alarm is activated
     */
    private boolean isAlarm;

    public RoomMongoDB(int idRoom, String nameRoom, double volumeRoomM3, ArrayList<Window> windows, ArrayList<Heater> heaters, ArrayList<Cooler> coolers, ArrayList<Light> lights, int persons, int animals, AirConditioner airConditoner, double internalTemperatureC, double outsideTemperatureC, double lightLumen, double electricityKwtPerHour, double oxygenPercentOfVolume, double CO2PercentOfVolume, double minRoomTemperatureC, double maxRoomTemperatureC, boolean isSmoke, boolean isAlarm) {
        this.idRoom = idRoom;
        this.nameRoom = nameRoom;
        this.volumeRoomM3 = volumeRoomM3;
        this.windows = windows;
        this.heaters = heaters;
        this.coolers = coolers;
        this.lights = lights;
        this.persons = persons;
        this.animals = animals;
        this.airConditioner = airConditoner;
        this.internalTemperatureC = internalTemperatureC;
        this.outsideTemperatureC = outsideTemperatureC;
        this.lightLumen = lightLumen;
        this.electricityKwtPerHour = electricityKwtPerHour;
        this.oxygenPercentOfVolume = oxygenPercentOfVolume;
        this.CO2PercentOfVolume = CO2PercentOfVolume;
        this.minRoomTemperatureC = minRoomTemperatureC;
        this.maxRoomTemperatureC = maxRoomTemperatureC;
        this.isSmoke = isSmoke;
        this.isAlarm = isAlarm;
    }

    public RoomMongoDB() {
    }

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

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public int getAnimals() {
        return animals;
    }

    public void setAnimals(int animals) {
        this.animals = animals;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public double getInternalTemperatureC() {
        return internalTemperatureC;
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

    public double getMinRoomTemperatureC() {
        return minRoomTemperatureC;
    }

    public void setMinRoomTemperatureC(double minRoomTemperatureC) {
        this.minRoomTemperatureC = minRoomTemperatureC;
    }

    public double getMaxRoomTemperatureC() {
        return maxRoomTemperatureC;
    }

    public void setMaxRoomTemperatureC(double maxRoomTemperatureC) {
        this.maxRoomTemperatureC = maxRoomTemperatureC;
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
}
