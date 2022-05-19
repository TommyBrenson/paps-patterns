package paps.lab10;

import java.util.ArrayList;
import java.util.List;

public class ConcreteControlUnit implements ControlUnit {
    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startEngine() {
        System.out.println("Control unit received command on start the engine...");
        vehicle.startEngine();
    }

    public void stopEngine() {
        System.out.println("Control unit received command on stop the engine...");
        vehicle.stopEngine();
    }
}
