package paps.lab13;

public enum UserRole {
    CUSTOMER("Customer"),
    DIRECTOR("Director"),
    MANAGER("Manager"),
    OPERATOR("Operator");

    private String name;

    UserRole (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
