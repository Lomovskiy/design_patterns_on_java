package com.lomovskiy.dpoj.creational.abstract_factory;

import org.jetbrains.annotations.NotNull;

public interface UIAbstractFactory {

    @NotNull Button getButton();

    @NotNull CheckBox getCheckBox();

    @NotNull TextField getTextField();

}
