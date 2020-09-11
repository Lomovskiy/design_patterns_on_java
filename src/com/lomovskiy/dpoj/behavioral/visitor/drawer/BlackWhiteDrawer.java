package com.lomovskiy.dpoj.behavioral.visitor.drawer;

import com.lomovskiy.dpoj.behavioral.visitor.figure.Figure;
import org.jetbrains.annotations.NotNull;

public class BlackWhiteDrawer implements Drawer {

    @Override
    public void draw(@NotNull Figure figure) {
        System.out.printf("Рисую чёрно-белый %s\n", figure);
    }

}
