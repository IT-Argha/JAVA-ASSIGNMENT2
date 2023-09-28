// Q: 3
// AUTHOR: ARGHA DIGAR
// TITLE: Airplane Class with Flight Status and Delay Methods
// DESCRIPTION: This Java program defines an Airplane class with flight number, destination, and departure time attributes. It provides methods to check flight status and delay the flight.

import java.text.SimpleDateFormat;
import java.util.Date;

class Airplane {
    private String flightNumber;
    private String destination;
    private Date departureTime;
    private boolean delayed;

    public Airplane(String flightNumber, String destination, Date departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public void delayFlight() {
        delayed = true;
    }

    public void checkFlightStatus() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String status = delayed ? "Delayed" : "On time";
        System.out.println("Flight " + flightNumber + " to " + destination + " departing at " + sdf.format(departureTime) + " is " + status + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Airplane object for a flight
        Date departureTime = new Date(); // Current date and time
        Airplane flight = new Airplane("AA123", "New York", departureTime);

        // Check and print the initial flight status
        flight.checkFlightStatus();

        // Delay the flight and check status again
        flight.delayFlight();
        flight.checkFlightStatus();
    }
}
