package paps.lab10;

public class Vehicle implements ControlUnit{
    private String id;
    private String brand;
    private boolean isEngineStarted = false;

    public Vehicle(String id, String brand, String condition) {
        this.id = id;
        this.brand = brand;
    }

    public void startEngine() {
        if (!isEngineStarted) {
            System.out.println(String.format("Vehicle #%s (%s): engine has been started!", this.id, this.brand));
            this.isEngineStarted = true;
        }
        else System.out.println("Engine is already started!");
    }

    public void stopEngine() {
        if (isEngineStarted) {
            System.out.println(String.format("Vehicle #%s (%s): engine has been stopped!", this.id, this.brand));
            this.isEngineStarted = false;
        }
        else System.out.println("Engine is already stopped!");
    }
}
