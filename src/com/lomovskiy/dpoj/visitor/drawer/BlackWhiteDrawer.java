package com.lomovskiy.dpoj.visitor.drawer;

import com.lomovskiy.dpoj.visitor.figure.Figure;
import org.jetbrains.annotations.NotNull;

public class BlackWhiteDrawer implements Drawer {

    @Override
    public void draw(@NotNull Figure figure) {
        System.out.printf("Рисую чёрно-белый %s\n", figure);
    }

}
