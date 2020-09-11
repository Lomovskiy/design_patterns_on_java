package com.lomovskiy.dpoj.behavioral.visitor.figure;

import com.lomovskiy.dpoj.behavioral.visitor.drawer.Drawer;
import org.jetbrains.annotations.NotNull;

public interface Figure {

    void accept(@NotNull Drawer drawer);

}
