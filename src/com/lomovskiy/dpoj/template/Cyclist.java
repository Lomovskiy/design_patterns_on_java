package com.lomovskiy.dpoj.template;

public class Cyclist extends Sportsman {

    @Override
    protected void warmUp() {
        System.out.println("Проверка велосипеда.");
    }

    @Override
    protected void mainWork() {
        System.out.println("Езда по горной местности.");
    }

    @Override
    protected void coolDown() {
        System.out.println("Смазка велосипеда.");
    }

}
