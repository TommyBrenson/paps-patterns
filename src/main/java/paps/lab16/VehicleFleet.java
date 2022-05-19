package paps.lab16;

import java.util.HashMap;
import java.util.Map;

public class VehicleFleet {
    private static final Map<String, Vehicle> vehicles = new HashMap<>();

    public Vehicle getVehicle(String type, String id, String brand) {
        Vehicle vehicle = vehicles.get(id);
        if (vehicle == null) {
            switch (type.toUpperCase()) {
                case "ELECTRIC":
                    System.out.println("-----------------\nRegistering new electric vehicle...");
                    vehicle = new ElectricVehicle(id, brand);
                    break;
                case "PETROL":
                    System.out.println("-----------------\nRegistering new petrol vehicle...");
                    vehicle = new PetrolVehicle(id, brand);
                    break;
                case "HYBRID":
                    System.out.println("-----------------\nRegistering new hybrid vehicle...");
                    vehicle = new HybridVehicle(id, brand);
                    break;
            }
            vehicles.put(id, vehicle);
        }
        return vehicle;
    }
}
