package paps.lab15;

public class LuxeStrategy implements PayStrategy {
    private final double payRate = 1.4;

    @Override
    public void payRide(int minutes) {
        System.out.println(String.format("---------------------\nYour riding on luxe-class car for %d minutes costs %.2f$.\n", minutes, this.payRate * minutes));
    }
}
