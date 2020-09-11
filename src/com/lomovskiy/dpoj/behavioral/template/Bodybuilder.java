package com.lomovskiy.dpoj.behavioral.template;

public class Bodybuilder extends Sportsman {

    @Override
    protected void warmUp() {
        System.out.println("Суставная разминка.");
    }

    @Override
    protected void mainWork() {
        System.out.println("Жим штанги.");
    }

    @Override
    protected void coolDown() {
        System.out.println("Растяжка грудных мышц.");
    }

}
