package telran.m2m.dto;

/**
 * Data Transfer Object for the Window in the monitoring and control system for buildings
 * made for generation of imitation model to test the functionality of microservices project
 * @author Andrey Lavrinenko
 */
public class Window {

    /**
     * Identification number of window object
     */
    private int idWindow;

    /**
     * Boolean flag representing if the current window is opened
     */
    private boolean isOpened;

    /**
     * Height of window in meters
     */
    private double heightM;

    /**
     * Width of window in meters
     */
    private double widthM;

    public Window(int idWindow, boolean isOpened, double heightM, double widthM) {
        this.idWindow = idWindow;
        this.isOpened = isOpened;
        this.heightM = heightM;
        this.widthM = widthM;
    }

    public Window() {
    }

    public int getIdWindow() {
        return idWindow;
    }

    public void setIdWindow(int idWindow) {
        this.idWindow = idWindow;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public double getHeightM() {
        return heightM;
    }

    public void setHeightM(double heightM) {
        this.heightM = heightM;
    }

    public double getWidthM() {
        return widthM;
    }

    public void setWidthM(double widthM) {
        this.widthM = widthM;
    }
}
