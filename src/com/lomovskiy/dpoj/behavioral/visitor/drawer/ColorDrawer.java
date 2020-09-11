package com.lomovskiy.dpoj.behavioral.visitor.drawer;

import com.lomovskiy.dpoj.behavioral.visitor.figure.Figure;
import org.jetbrains.annotations.NotNull;

public class ColorDrawer implements Drawer {

    @Override
    public void draw(@NotNull Figure figure) {
        System.out.printf("Рисую цветной %s\n", figure);
    }

}

