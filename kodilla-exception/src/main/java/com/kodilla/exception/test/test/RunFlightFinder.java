package com.kodilla.exception.test.test;

import java.util.HashMap;
import java.util.Map;

public class RunFlightFinder {
    public static void main(String[] args) {
        // prepare data
        Map<String,Boolean> flights = new HashMap<>();
        flights.put("Boston", false);
        flights.put("Atlanta", true);

        // prepare flight to find
        Flight flight = new Flight("Warsaw", "Boston");

        FlightFinder flightSearch = new FlightFinder(flights);

        try {
            flightSearch.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: " + "\n" + e + "\n");
        } finally {
            System.out.println("Ending test for exceptions!");
        }
    }
}
