package paps.lab14;

public interface BookingStatus {
    public void getStatus();
    public BookingStatus nextStatus();
    public BookingStatus prevStatus();
}
