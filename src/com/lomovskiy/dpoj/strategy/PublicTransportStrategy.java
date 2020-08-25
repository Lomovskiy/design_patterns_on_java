package com.lomovskiy.dpoj.strategy;

public class PublicTransportStrategy implements Strategy {

    @Override
    public void buildRoute(double startPoint, double endPoint) {
        System.out.printf("Построен маршрут на общественном транспорте от точки %s до точки %s\n", startPoint, endPoint);
    }

}
