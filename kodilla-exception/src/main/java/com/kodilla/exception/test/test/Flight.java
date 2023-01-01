package com.kodilla.exception.test.test;

public final class Flight {

    String departureAirport;
    String arrivalAirport;

    public Flight(final String departureAirport,final String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
