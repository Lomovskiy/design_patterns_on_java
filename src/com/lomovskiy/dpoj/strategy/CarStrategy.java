package com.lomovskiy.dpoj.strategy;

public class CarStrategy implements Strategy {

    @Override
    public void buildRoute(double startPoint, double endPoint) {
        System.out.printf("Построен маршрут на автомобиле от точки %s до точки %s\n", startPoint, endPoint);
    }

}
