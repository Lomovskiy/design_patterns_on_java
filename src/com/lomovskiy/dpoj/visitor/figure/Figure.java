package com.lomovskiy.dpoj.visitor.figure;

import com.lomovskiy.dpoj.visitor.drawer.Drawer;
import org.jetbrains.annotations.NotNull;

public interface Figure {

    void accept(@NotNull Drawer drawer);

}
