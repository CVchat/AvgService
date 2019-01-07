package telran.m2m.dto;

/**
 * Data Transfer Object for the Cooler in the monitoring and control system for buildings
 * made for generation of imitation model to test the functionality of microservices project
 * @author Andrey Lavrinenko
 */
public class Cooler {

    /**
     * Identification number of Cooler
     */
    private int idCooler;

    /**
     * Electricity consumption for cooling the room, in kilowatts per hour
     */
    private double electricityPerHour;

    /**
     * Cooling efficiency, in percents
     */
    private double coolingEff;

    /**
     * Boolean flag representing if cooler is currently working
     */
    private boolean isOperating;

    public Cooler(int idCooler, double electricityPerHour, double coolingEff, boolean isOperating) {
        this.idCooler = idCooler;
        this.electricityPerHour = electricityPerHour;
        this.coolingEff = coolingEff;
        this.isOperating = isOperating;
    }

    public Cooler() {
    }

    public int getIdCooler() {
        return idCooler;
    }

    public void setIdCooler(int idCooler) {
        this.idCooler = idCooler;
    }

    public double getElectricityPerHour() {
        return electricityPerHour;
    }

    public void setElectricityPerHour(double electricityPerHour) {
        this.electricityPerHour = electricityPerHour;
    }

    public double getCoolingEff() {
        return coolingEff;
    }

    public void setCoolingEff(double coolingEff) {
        this.coolingEff = coolingEff;
    }

    public boolean isOperating() {
        return isOperating;
    }

    public void setOperating(boolean operating) {
        isOperating = operating;
    }
}
