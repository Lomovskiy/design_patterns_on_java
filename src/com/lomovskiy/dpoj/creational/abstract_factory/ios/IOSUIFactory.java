package com.lomovskiy.dpoj.creational.abstract_factory.ios;

import com.lomovskiy.dpoj.creational.abstract_factory.Button;
import com.lomovskiy.dpoj.creational.abstract_factory.CheckBox;
import com.lomovskiy.dpoj.creational.abstract_factory.TextField;
import com.lomovskiy.dpoj.creational.abstract_factory.UIAbstractFactory;
import org.jetbrains.annotations.NotNull;

public class IOSUIFactory implements UIAbstractFactory {

    @Override
    public @NotNull Button getButton() {
        return new IOSButton();
    }

    @Override
    public @NotNull CheckBox getCheckBox() {
        return new IOSCheckBox();
    }

    @Override
    public @NotNull TextField getTextField() {
        return new IOSTextField();
    }
}
