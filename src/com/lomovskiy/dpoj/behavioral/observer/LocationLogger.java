package com.lomovskiy.dpoj.behavioral.observer;

public class LocationLogger implements LocationListener {

    @Override
    public void onLocationUpdated(double latitude, double longitude) {
        System.out.printf(
                "Log location from %s: latitude: %s; longitude: %s\n",
                this.toString(),
                latitude,
                longitude
        );
    }

}
