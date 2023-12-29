package com.example;

public class CabFareCalculator {
    
    static final double cost_per_min = 1;
    static final double cost_per_km = 10;
    static final double min_fare = 5;

    public double calculateFare(double time, double distance)
    {
        double total_fare=0;

        total_fare = cost_per_km*distance + cost_per_min*time;

        return Math.max(total_fare , min_fare);
    }

}