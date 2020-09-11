package com.lomovskiy.dpoj.behavioral.observer;

import com.sun.istack.internal.NotNull;

public interface LocationProvider {

    boolean registerListener(@NotNull LocationListener listener);

    boolean unregisterListener(@NotNull LocationListener listener);

    void notifyListeners(double latitude, double longitude);

}
