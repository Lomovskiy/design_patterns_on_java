package com.lomovskiy.dpoj.visitor.figure;

import com.lomovskiy.dpoj.visitor.drawer.Drawer;
import org.jetbrains.annotations.NotNull;

public class Triangle implements Figure {

    @Override
    public void accept(@NotNull Drawer drawer) {
        drawer.draw(this);
    }

    @Override
    public String toString() {
        return "треугльник";
    }
}
