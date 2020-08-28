package com.lomovskiy.dpoj.template;

public abstract class Sportsman {

    protected abstract void warmUp();
    protected abstract void mainWork();
    protected abstract void coolDown();

    public void doWorkout() {
        warmUp();
        mainWork();
        coolDown();
    }

}
