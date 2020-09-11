package com.lomovskiy.dpoj.behavioral.strategy;

import org.jetbrains.annotations.NotNull;

public class Navigator {

    private @NotNull Strategy currentStrategy;

    public Navigator(@NotNull Strategy strategy) {
        currentStrategy = strategy;
    }

    public void setStrategy(@NotNull Strategy strategy) {
        currentStrategy = strategy;
    }

    public void buildRoute(double startPoint, double endPoint) {
        currentStrategy.buildRoute(startPoint, endPoint);
    }

}
