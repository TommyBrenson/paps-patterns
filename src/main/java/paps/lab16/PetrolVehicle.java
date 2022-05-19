package paps.lab16;

public class PetrolVehicle implements Vehicle {
    private String id;
    private String brand;

    public PetrolVehicle(String id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public void transmitPosition(String position) {
        System.out.println(String.format("------------------\nPetrol %s's (#%s) position: %s", this.id, this.brand, position));
    }
}
