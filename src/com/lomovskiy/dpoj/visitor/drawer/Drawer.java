package com.lomovskiy.dpoj.visitor.drawer;

import com.lomovskiy.dpoj.visitor.figure.Figure;
import org.jetbrains.annotations.NotNull;

public interface Drawer {

    void draw(@NotNull Figure figure);

}
