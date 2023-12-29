package com.example;

import java.util.ArrayList;

public class User {
    String userid;
    ArrayList<Ride> rideList;

    public User(String uid)
    {
        userid = uid;
        rideList = new ArrayList<>();
    }
}
