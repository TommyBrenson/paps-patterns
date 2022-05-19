package paps.lab15;

public class Customer {
    private String id;
    private String first_name;

    private PayStrategy payStrategy;

    public Customer(String id, String first_name) {
        this.id = id;
        this.first_name = first_name;
    }

    public void setPayStrategy(PayStrategy strategy) {
        this.payStrategy = strategy;
    }

    public void payRide(int minutes) {
        System.out.println(String.format("%s!", this.first_name));
        payStrategy.payRide(minutes);
    }
}
