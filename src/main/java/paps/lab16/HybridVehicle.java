package paps.lab16;

public class HybridVehicle implements Vehicle {
    private String id;
    private String brand;

    public HybridVehicle(String id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public void transmitPosition(String position) {
        System.out.println(String.format("------------------\nHybrid %s's (#%s) position: %s", this.id, this.brand, position));
    }

}
