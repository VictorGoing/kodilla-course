package com.kodilla.patterns.chellenge.airport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private HashSet<Flight> flights;


    public FlightFinder(HashSet<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findFrom(String city){
       return flights.stream().filter(x -> x.getFrom().equals(city)).collect(Collectors.toList());
    }

    public List<Flight> findTo(String city){
        return flights.stream().filter(x -> x.getTo().equals(city)).collect(Collectors.toList());
    }

    public List<Pair<Flight,Flight>> findToConnection(String fromCity, String toCity){
        List<Flight> fromList = findFrom(fromCity);
        List<Flight> toList = findTo(toCity);
        List<Pair<Flight,Flight>> resultList = new ArrayList<>();
        for(Flight from :fromList){
            for(Flight to :toList){
                if(from.getTo().equals(to.getFrom())){
                    resultList.add(new Pair<>(from,to));
                }
            }
        }
        return resultList;
    }
}
