package paps.lab14;

public class InvalidBooking implements BookingStatus {
    private String id;

    public InvalidBooking(String id) {
        this.id = id;
    }

    public void getStatus() {
        System.out.println(String.format("------------------\nBooking #%s hasn't pass verification!", this.id));
    }

    public BookingStatus nextStatus() {
        return new NewBooking(this.id);
    }

    public BookingStatus prevStatus() {
        return new ValidBooking(this.id);
    }
}
