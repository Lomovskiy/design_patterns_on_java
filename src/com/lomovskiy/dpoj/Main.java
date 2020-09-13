package com.lomovskiy.dpoj;

import com.lomovskiy.dpoj.creational.builder.Screen;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        @NotNull Screen screen = new Screen.Builder()
                .setFooter("Footer")
                .setTitle("Title")
                .setHeader("Header")
                .build();
        System.out.println(screen);
        screen = new Screen.Builder()
                .setTitle("Title")
                .build();
        System.out.println(screen);
        screen = new Screen.Builder()
                .build();
        System.out.println(screen);
    }

}
