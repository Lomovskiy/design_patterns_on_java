package com.lomovskiy.dpoj.behavioral.visitor.drawer;

import com.lomovskiy.dpoj.behavioral.visitor.figure.Figure;
import org.jetbrains.annotations.NotNull;

public interface Drawer {

    void draw(@NotNull Figure figure);

}
