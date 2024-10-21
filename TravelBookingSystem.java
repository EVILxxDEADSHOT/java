interface Bookable {
    void book();
}

interface Cancellable {
    void cancel();
}

class Flight implements Bookable, Cancellable {
    private String flightNumber;
    private String bookingStatus;
    private String cancellationPolicy;

    public Flight(String flightNumber, String cancellationPolicy) {
        this.flightNumber = flightNumber;
        this.cancellationPolicy = cancellationPolicy;
        this.bookingStatus = "Not Booked";
    }

    public void book() {
        bookingStatus = "Booked";
        System.out.println("Flight " + flightNumber + " has been booked.");
    }

    public void cancel() {
        bookingStatus = "Cancelled";
        System.out.println("Flight " + flightNumber + " has been cancelled. Cancellation Policy: " + cancellationPolicy);
    }

    public String getBookingStatus() {
        return bookingStatus;
    }
}

class Hotel implements Bookable, Cancellable {
    private String hotelName;
    private String bookingStatus;
    private String cancellationPolicy;

    public Hotel(String hotelName, String cancellationPolicy) {
        this.hotelName = hotelName;
        this.cancellationPolicy = cancellationPolicy;
        this.bookingStatus = "Not Booked";
    }

    public void book() {
        bookingStatus = "Booked";
        System.out.println("Hotel " + hotelName + " has been booked.");
    }

    public void cancel() {
        bookingStatus = "Cancelled";
        System.out.println("Hotel " + hotelName + " has been cancelled. Cancellation Policy: " + cancellationPolicy);
    }

    public String getBookingStatus() {
        return bookingStatus;
    }
}

public class TravelBookingSystem {
    public static void main(String[] args) {
        Flight flight = new Flight("AI202", "Free cancellation within 24 hours.");
        flight.book();
        System.out.println("Flight Booking Status: " + flight.getBookingStatus());
        
        flight.cancel();
        System.out.println("Flight Booking Status: " + flight.getBookingStatus());

        Hotel hotel = new Hotel("Ocean View Hotel", "Free cancellation until 1 day before check-in.");
        hotel.book();
        System.out.println("Hotel Booking Status: " + hotel.getBookingStatus());

        hotel.cancel();
        System.out.println("Hotel Booking Status: " + hotel.getBookingStatus());
    }
}
