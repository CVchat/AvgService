package telran.m2m.dto;

import org.springframework.data.annotation.Id;

/**
 * Data Transfer Object for the Lite in the monitoring and control system for buildings
 * made for generation of imitation model to test the functionality of microservices project
 * @author Andrey Lavrinenko
 */
public class Light {

    /**
     * Identification number of Light
     */
    private int idLight;

    /**
     * Electricity consumption for lightning the room, in kilowatts per hour
     */
    private double electricityPerHour;

    /**
     * Current lighting intensity by the current Light in the room, in lumen per killowatt
     */
    private double lumenPerKwt;

    /**
     * Light efficiency (to calculate heating power), in percents
     */
    private double lightEff;

    /**
     * Boolean flag representing if cooler is currently working
     */
    private boolean isOperating;

    public Light(int idLight, double electricityPerHour, double lumenPerKwt, double lightEff, boolean isOperating) {
        this.idLight = idLight;
        this.electricityPerHour = electricityPerHour;
        this.lumenPerKwt = lumenPerKwt;
        this.lightEff = lightEff;
        this.isOperating = isOperating;
    }

    public Light() {
    }

    public int getIdLight() {
        return idLight;
    }

    public void setIdLight(int idLight) {
        this.idLight = idLight;
    }

    public double getElectricityPerHour() {
        return electricityPerHour;
    }

    public void setElectricityPerHour(double electricityPerHour) {
        this.electricityPerHour = electricityPerHour;
    }

    public double getlumenPerKwt() {
        return lumenPerKwt;
    }

    public void setlumenPerKwt(double lumenPerKwt) {
        this.lumenPerKwt = lumenPerKwt;
    }

    public double getlightEff() {
        return lightEff;
    }

    public void setLightEff(double lightEff) {
        this.lightEff = lightEff;
    }

    public boolean isOperating() {
        return isOperating;
    }

    public void setOperating(boolean operating) {
        isOperating = operating;
    }
}
