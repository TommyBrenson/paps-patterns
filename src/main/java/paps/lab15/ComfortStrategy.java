package paps.lab15;

public class ComfortStrategy implements PayStrategy {
    private final double payRate = 0.9;

    @Override
    public void payRide(int minutes) {
        System.out.println(String.format("---------------------\nYour riding on comfort-class car for %d minutes costs %.2f$.\n", minutes, this.payRate * minutes));
    }
}
