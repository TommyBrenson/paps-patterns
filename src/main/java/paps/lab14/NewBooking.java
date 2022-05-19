package paps.lab14;

public class NewBooking implements BookingStatus {
    private String id;

    public NewBooking(String id) {
         this.id = id;
    }
    public void getStatus() {
        System.out.println(String.format("------------------\nBooking #%s is new and should be verified!", this.id));
    }

    public BookingStatus nextStatus() {
        return new ValidBooking(this.id);
    }

    public BookingStatus prevStatus() {
        return new InvalidBooking(this.id);
    }
}
