package telran.m2m.dto;

/**
 * Data Transfer Object for the Heater in the monitoring and control system for buildings
 * made for generation of imitation model to test the functionality of microservices project
 * @author Andrey Lavrinenko
 */
public class Heater {

    /**
     * Identification number of Cooler
     */
    private int idHeater;

    /**
     * Electricity consumption for heating the room, in kilowatts per hour
     */
    private double electricityPerHour;

    /**
     * Heating efficiency, %
     */
    private double heatingEff;

    /**
     * Boolean flag representing if cooler is currently working
     */
    private boolean isOperating;

    public Heater(int idHeater, double electricityPerHour, double heatingEff, boolean isOperating) {
        this.idHeater = idHeater;
        this.electricityPerHour = electricityPerHour;
        this.heatingEff = heatingEff;
        this.isOperating = isOperating;
    }

    public Heater() {
    }

    public int getIdHeater() {
        return idHeater;
    }

    public void setIdHeater(int idHeater) {
        this.idHeater = idHeater;
    }

    public double getElectricityPerHour() {
        return electricityPerHour;
    }

    public void setElectricityPerHour(double electricityPerHour) {
        this.electricityPerHour = electricityPerHour;
    }

    public double getHeatingEff() {
        return heatingEff;
    }

    public void setHeatingEff(double heatingKwtPerHour) {
        this.heatingEff = heatingEff;
    }

    public boolean isOperating() {
        return isOperating;
    }

    public void setOperating(boolean operating) {
        isOperating = operating;
    }
}
