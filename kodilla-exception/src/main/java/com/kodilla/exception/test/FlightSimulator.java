package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSimulator {


    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airports = new HashMap<>();

            Boolean bool = airports.get(flight.getArrivalAirport());
            if(bool != null) System.out.println("Airport is available");
            else {
                System.out.println("Airport is not available");
                throw new RouteNotFoundException();
            }


    }
}
