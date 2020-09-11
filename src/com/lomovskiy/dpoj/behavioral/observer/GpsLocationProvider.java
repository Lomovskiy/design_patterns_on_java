package com.lomovskiy.dpoj.behavioral.observer;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class GpsLocationProvider implements LocationProvider {

    private final List<LocationListener> listeners;

    public GpsLocationProvider() {
        listeners = new ArrayList<>();
    }

    @Override
    public boolean registerListener(LocationListener listener) {
        return listeners.add(listener);
    }

    @Override
    public boolean unregisterListener(LocationListener listener) {
        return listeners.remove(listener);
    }

    @Override
    public void notifyListeners(double latitude, double longitude) {
        for (@NotNull final LocationListener listener : listeners) {
            listener.onLocationUpdated(latitude, longitude);
        }
    }

}
