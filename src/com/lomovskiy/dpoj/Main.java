package com.lomovskiy.dpoj;

import com.lomovskiy.dpoj.template.Bodybuilder;
import com.lomovskiy.dpoj.template.Cyclist;
import com.lomovskiy.dpoj.template.Runner;
import com.lomovskiy.dpoj.template.Sportsman;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        @NotNull Sportsman sportsman = new Runner();
        sportsman.doWorkout();
        sportsman = new Bodybuilder();
        sportsman.doWorkout();
        sportsman = new Cyclist();
        sportsman.doWorkout();
    }

}
