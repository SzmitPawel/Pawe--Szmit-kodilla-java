package com.kodilla.exception.test.test;

import java.util.HashMap;
import java.util.Map;

public final class FlightFinder {

    private final Map<String,Boolean> flights;

    public FlightFinder(final Map<String, Boolean> canFlight) {
        this.flights = canFlight;
    }

    public void findFilght(final Flight flight) throws RouteNotFoundException {

        if (this.flights.containsKey(flight.arrivalAirport) && this.flights.get(flight.arrivalAirport) == false) {
            throw new RouteNotFoundException();
        }
    }
}