package paps.lab15;

public class Strategy {
    public static void main(String [] args) {
        int minutes = 400;
        Customer customer = new Customer("2148jcnzcjy3bcbzerlk", "Nick");

        customer.setPayStrategy(new EconomStrategy());
        customer.payRide(minutes);
        customer.setPayStrategy(new ComfortStrategy());
        customer.payRide(minutes);
        customer.setPayStrategy(new LuxeStrategy());
        customer.payRide(minutes);
    }
}
