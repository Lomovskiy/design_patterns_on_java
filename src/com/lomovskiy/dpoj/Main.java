package com.lomovskiy.dpoj;

import com.lomovskiy.dpoj.creational.multitone.Multitone;
import com.lomovskiy.dpoj.creational.multitone.MultitoneType;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        @NotNull Multitone multitone1 = Multitone.getInstance(MultitoneType.ONE);
        @NotNull Multitone multitone2 = Multitone.getInstance(MultitoneType.TWO);
        @NotNull Multitone multitone3 = Multitone.getInstance(MultitoneType.THREE);
        System.out.println(multitone1);
        System.out.println(multitone2);
        System.out.println(multitone3);
        System.out.println("-----------------");
        multitone1 = Multitone.getInstance(MultitoneType.ONE);
        System.out.println(multitone1);
    }

}
