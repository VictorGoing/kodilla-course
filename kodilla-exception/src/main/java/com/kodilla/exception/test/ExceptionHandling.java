package com.kodilla.exception.test;

import java.sql.SQLOutput;

public class ExceptionHandling {

    public static void main(String[] args) {
        Flight flight = new Flight("Szymany","Wrocław");
        FlightSimulator flightSimulator = new FlightSimulator();

        try{
            flightSimulator.findFlight(flight);
        }catch (RouteNotFoundException e){
            System.out.println("404: Airport not found");
        }

//        SecondChallenge challenge = new SecondChallenge();
//        String result = "";
//        try {
//            challenge.probablyIWillThrowException(3,2);
//        } catch (Exception e) {
//            System.out.println("Exception was caught.");
//        } finally {
//            System.out.println(result);
//        }
    }
}
