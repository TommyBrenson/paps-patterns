package paps.lab10;

public class Mediator {
    public static void main(String[] args) {
        ConcreteControlUnit controlUnit = new ConcreteControlUnit();

        User customer = new Customer("214k12da21j4", "Andrew", controlUnit);
        User operator = new Operator("765893dhjjh3", "Nick", controlUnit);
        Vehicle vehicle1 = new Vehicle("413894318djadxxaw231", "BMW", "Normal");
        Vehicle vehicle2 = new Vehicle("21892jdx3419jajxz72l", "Audi", "Normal");

        controlUnit.setVehicle(vehicle1);

        operator.startEngine();
        customer.stopEngine();
        operator.stopEngine();

        controlUnit.setVehicle(vehicle2);

        operator.startEngine();
    }
}
