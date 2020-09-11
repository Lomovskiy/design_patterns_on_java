package com.lomovskiy.dpoj.creational.abstract_factory.android;

import com.lomovskiy.dpoj.creational.abstract_factory.Button;
import com.lomovskiy.dpoj.creational.abstract_factory.CheckBox;
import com.lomovskiy.dpoj.creational.abstract_factory.TextField;
import com.lomovskiy.dpoj.creational.abstract_factory.UIAbstractFactory;
import com.lomovskiy.dpoj.creational.abstract_factory.ios.IOSButton;
import com.lomovskiy.dpoj.creational.abstract_factory.ios.IOSCheckBox;
import com.lomovskiy.dpoj.creational.abstract_factory.ios.IOSTextField;
import org.jetbrains.annotations.NotNull;

public class AndroidUIFactory implements UIAbstractFactory {

    @Override
    public @NotNull Button getButton() {
        return new AndroidButton();
    }

    @Override
    public @NotNull CheckBox getCheckBox() {
        return new AndroidCheckBox();
    }

    @Override
    public @NotNull TextField getTextField() {
        return new AndroidTextField();
    }
}
