package paps.lab12;

public class CarFactory {
    public static Vehicle getVehicle(AbstractCarFactory factory) {
        return factory.createVehicle();
    }
}
