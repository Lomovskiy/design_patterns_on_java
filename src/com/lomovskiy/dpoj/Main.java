package com.lomovskiy.dpoj;

import com.lomovskiy.dpoj.template.Bodybuilder;
import com.lomovskiy.dpoj.template.Cyclist;
import com.lomovskiy.dpoj.template.Runner;
import com.lomovskiy.dpoj.template.Sportsman;
import com.lomovskiy.dpoj.visitor.drawer.BlackWhiteDrawer;
import com.lomovskiy.dpoj.visitor.drawer.ColorDrawer;
import com.lomovskiy.dpoj.visitor.figure.Circle;
import com.lomovskiy.dpoj.visitor.figure.Figure;
import com.lomovskiy.dpoj.visitor.figure.Rectangle;
import com.lomovskiy.dpoj.visitor.figure.Triangle;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        final @NotNull ArrayList<Figure> figures = new ArrayList<>(3);
        figures.add(new Rectangle());
        figures.add(new Triangle());
        figures.add(new Circle());

        final @NotNull ColorDrawer colorDrawer = new ColorDrawer();
        final @NotNull BlackWhiteDrawer blackWhiteDrawer = new BlackWhiteDrawer();

        figures.forEach(colorDrawer::draw);
    }

}
