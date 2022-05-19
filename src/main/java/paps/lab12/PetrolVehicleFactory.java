package paps.lab12;

public class PetrolVehicleFactory implements AbstractCarFactory {
    private String id;
    private String brand;
    private int fuel;

    public PetrolVehicleFactory(String id, String brand, int fuel) {
        this.id = id;
        this.brand = brand;
        this.fuel = fuel;
    }

    public PetrolVehicle createVehicle() {
        return new PetrolVehicle(this.id, this.brand, this.fuel);
    }
}
