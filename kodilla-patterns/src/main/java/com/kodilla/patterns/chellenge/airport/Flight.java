package com.kodilla.patterns.chellenge.airport;

public class Flight {
    private String from;
    private String to;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Flight(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (from != null ? !from.equals(flight.from) : flight.from != null) return false;
        return to != null ? to.equals(flight.to) : flight.to == null;
    }

    @Override
    public int hashCode() {
        int result = from != null ? from.hashCode() : 0;
        result = 31 * result + (to != null ? to.hashCode() : 0);
        return result;
    }
}
