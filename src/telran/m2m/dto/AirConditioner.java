package telran.m2m.dto;

/**
 * Data Transfer Object for the Air Conditioner in the monitoring and control system for buildings
 * made for generation of imitation model to test the functionality of microservices project
 * @author Andrey Lavrinenko
 */
public class AirConditioner {

    /**
     * Air flow of central air flow to room from central air conditioning system,
     * in cubic miters per hour,
     * e.g. in business offices A class
     */
    private double airFlowM3PerHour;

    /**
     * Electricity consumption for conditioning of the room, in kilowatts per hour
     */
    private double electricityKwtPerHour;

    /**
     * Boolean flag representing if air conditioner is currently working
     */
    private boolean isOperating;

    public AirConditioner(double airFlowM3PerHour, double electricityKwtPerHour, boolean isOperating) {
        this.airFlowM3PerHour = airFlowM3PerHour;
        this.electricityKwtPerHour = electricityKwtPerHour;
        this.isOperating = isOperating;
    }

    public AirConditioner() {
    }

    public double getAirFlowM3PerHour() {
        return airFlowM3PerHour;
    }

    public void setAirFlowM3PerHour(double airFlowM3PerHour) {
        this.airFlowM3PerHour = airFlowM3PerHour;
    }

    public double getElectricityKwtPerHour() {
        return electricityKwtPerHour;
    }

    public void setElectricityKwtPerHour(double electricityKwtPerHour) {
        this.electricityKwtPerHour = electricityKwtPerHour;
    }

    public boolean isOperating() {
        return isOperating;
    }

    public void setOperating(boolean operating) {
        isOperating = operating;
    }
}
