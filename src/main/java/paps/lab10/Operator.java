package paps.lab10;

public class Operator extends User {

    public Operator(String id, String name, ConcreteControlUnit controlUnit) {
        super(id, name, controlUnit);
    }

    public void startEngine() {
        System.out.println(String.format("---------------------\nOperator %s (#%s) starting engine...", this.name, this.id));
        controlUnit.startEngine();
    }
    public void stopEngine() {
        System.out.println(String.format("-----------------\nOperator %s (#%s) stopping engine...", this.name, this.id));
        controlUnit.stopEngine();
    }
}
