package com.lomovskiy.dpoj.template;

public class Runner extends Sportsman {

    @Override
    protected void warmUp() {
        System.out.println("Беговая разминка.");
    }

    @Override
    protected void mainWork() {
        System.out.println("Интервальный бег 4 раза по 500 метров.");
    }

    @Override
    protected void coolDown() {
        System.out.println("Растяжка ног.");
    }

}
