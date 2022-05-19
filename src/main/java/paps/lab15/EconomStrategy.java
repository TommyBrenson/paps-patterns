package paps.lab15;

public class EconomStrategy implements PayStrategy {
    private final double payRate = 0.6;

    @Override
    public void payRide(int minutes) {
        System.out.println(String.format("---------------------\nYour riding on econom-class car for %d minutes costs %.2f$.\n", minutes, this.payRate * minutes));
    }
}
