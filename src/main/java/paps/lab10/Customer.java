package paps.lab10;

public class Customer extends User {

    public Customer(String id, String name, ConcreteControlUnit controlUnit) {
        super(id, name, controlUnit);
    }

    public void startEngine() {
        System.out.println(String.format("---------------------\nCustomer %s (#%s) starting engine...", this.name, this.id));
        controlUnit.startEngine();
    }

    public void stopEngine() {
        System.out.println(String.format("----------------------\nCustomer %s (#%s) stopping engine...", this.name, this.id));
        controlUnit.stopEngine();
    }
}
