package paps.lab10;

abstract class User implements ControlUnit {
    String id;
    String name;
    ConcreteControlUnit controlUnit;

    User(String id, String name, ConcreteControlUnit controlUnit) {
        this.id = id;
        this.name = name;
        this.controlUnit = controlUnit;
    }

    void setControlUnit(ConcreteControlUnit controlUnit) {
        this.controlUnit = controlUnit;
    }

}
