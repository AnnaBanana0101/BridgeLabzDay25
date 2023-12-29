package com.example;

import java.util.ArrayList;

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


    public ArrayList<Ride> addRides(String uid, Ride[] rides)
    {
        User user = new User(uid);
        for(int i=0; i<rides.length; i++)
        {
            user.rideList.add(rides[i]);
        }
        return user.rideList;

    }

}