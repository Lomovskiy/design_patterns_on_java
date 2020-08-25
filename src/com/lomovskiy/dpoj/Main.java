package com.lomovskiy.dpoj;

import com.lomovskiy.dpoj.strategy.CarStrategy;
import com.lomovskiy.dpoj.strategy.HikingStrategy;
import com.lomovskiy.dpoj.strategy.Navigator;
import com.lomovskiy.dpoj.strategy.PublicTransportStrategy;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        final @NotNull Navigator navigator = new Navigator(new HikingStrategy());
        navigator.buildRoute(1.0, 2.0);
        navigator.setStrategy(new CarStrategy());
        navigator.buildRoute(3.0, 4.0);
        navigator.setStrategy(new PublicTransportStrategy());
        navigator.buildRoute(5.0, 6.0);
    }

}
