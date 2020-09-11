package com.lomovskiy.dpoj.behavioral.strategy;

public class PublicTransportStrategy implements Strategy {

    @Override
    public void buildRoute(double startPoint, double endPoint) {
        System.out.printf("Построен маршрут на общественном транспорте от точки %s до точки %s\n", startPoint, endPoint);
    }

}
