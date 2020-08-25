package com.lomovskiy.dpoj.strategy;

public class HikingStrategy implements Strategy {

    @Override
    public void buildRoute(double startPoint, double endPoint) {
        System.out.printf("Построен пешеходный маршрут от точки %s до точки %s\n", startPoint, endPoint);
    }

}
