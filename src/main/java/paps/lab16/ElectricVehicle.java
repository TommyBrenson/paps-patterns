package paps.lab16;

public class ElectricVehicle implements Vehicle {
    private String id;
    private String brand;

    public ElectricVehicle(String id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public void transmitPosition(String position) {
        System.out.println(String.format("------------------\nElectric %s's (#%s) position: %s", this.id, this.brand, position));
    }
}
