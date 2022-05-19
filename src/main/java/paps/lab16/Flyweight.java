package paps.lab16;

import java.util.ArrayList;
import java.util.List;

public class Flyweight {
    public static void main(String [] args) {
        VehicleFleet fleet = new VehicleFleet();

        List <Vehicle> vehicles = new ArrayList<>();

        // нициализируем список доступных автомобилей в автопарке (производим их регистрацию)
        vehicles.add(fleet.getVehicle("electric", "3401jnkzc39341cmkzx", "BMW"));
        vehicles.add(fleet.getVehicle("hybrid", "212392cnzxmnc384edw", "BMW"));
        vehicles.add(fleet.getVehicle("electric", "3401jnkzc39341cmkzx", "Audi"));
        vehicles.add(fleet.getVehicle("petrol", "24jk1lncz9214812123", "Volvo"));
        vehicles.add(fleet.getVehicle("petrol", "98147zkc78314jnzxc8", "Hyundai"));
        vehicles.add(fleet.getVehicle("hybrid", "mvz98027zxcnlzw41ds", "Honda"));
        vehicles.add(fleet.getVehicle("electric", "9z8v3j2mkzxkclj141l", "Opel"));

        System.out.println("_________________________________________\nTransmitting position for all vehicles...");
        // Вызываем для каждого доступного в автопарке автомобиля метод, позволяющий передать данные о местоположении
        for (Vehicle vehicle : vehicles) {
            vehicle.transmitPosition("32\'d Park Avenue");
        }

    }
}
