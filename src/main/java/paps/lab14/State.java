package paps.lab14;

public class State {
    public static void main(String [] args) {
        Booking booking = new Booking("adi213ijadhhu23");


        booking.checkStatus();
        booking.nextStatus();
        booking.checkStatus();
        booking.nextStatus();
        booking.checkStatus();
        booking.prevStatus();
        booking.checkStatus();
    }
}
