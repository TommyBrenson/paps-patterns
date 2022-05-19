package paps.lab14;

public class ValidBooking implements BookingStatus {
    private String id;

    public ValidBooking(String id) {
        this.id = id;
    }

    public void getStatus() {
        System.out.println(String.format("------------------\nBooking #%s has successfully passed verification!", this.id));
    }

    public BookingStatus nextStatus() {
        return new InvalidBooking(this.id);
    }

    public BookingStatus prevStatus() {
        return new NewBooking(this.id);
    }
}
