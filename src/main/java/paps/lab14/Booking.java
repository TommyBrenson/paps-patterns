package paps.lab14;

public class Booking {
    private String id;
    private BookingStatus status;

    public Booking(String id) {
        this.id = id;
        this.status = new NewBooking(this.id);
    }

    public void checkStatus() {
        status.getStatus();
    }

    public void nextStatus() {
        this.status = status.nextStatus();
    }

    public void prevStatus() {
        this.status = status.prevStatus();
    }
}
