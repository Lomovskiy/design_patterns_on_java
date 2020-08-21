package com.lomovskiy.dpoj;

import com.lomovskiy.dpoj.observer.GpsLocationProvider;
import com.lomovskiy.dpoj.observer.LocationLogger;
import com.sun.istack.internal.NotNull;

public class Main {

    public static void main(String[] args) {
        @NotNull final GpsLocationProvider locationProvider = new GpsLocationProvider();

        @NotNull final LocationLogger logger1 = new LocationLogger();
        @NotNull final LocationLogger logger2 = new LocationLogger();

        locationProvider.registerListener(logger1);
        locationProvider.registerListener(logger2);

        locationProvider.notifyListeners(1, 1);
        locationProvider.notifyListeners(2, 2);
        locationProvider.notifyListeners(3, 3);
    }

}
