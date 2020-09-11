package com.lomovskiy.dpoj;

import com.lomovskiy.dpoj.creational.abstract_factory.Button;
import com.lomovskiy.dpoj.creational.abstract_factory.CheckBox;
import com.lomovskiy.dpoj.creational.abstract_factory.TextField;
import com.lomovskiy.dpoj.creational.abstract_factory.UIAbstractFactory;
import com.lomovskiy.dpoj.creational.abstract_factory.android.AndroidUIFactory;
import com.lomovskiy.dpoj.creational.abstract_factory.ios.IOSUIFactory;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        @NotNull UIAbstractFactory uiFactory = new IOSUIFactory();
        @NotNull Button button = uiFactory.getButton();
        @NotNull CheckBox checkBox = uiFactory.getCheckBox();
        @NotNull TextField textField = uiFactory.getTextField();
        System.out.println(button);
        System.out.println(checkBox);
        System.out.println(textField);
        System.out.println("------------");
        uiFactory = new AndroidUIFactory();
        button = uiFactory.getButton();
        checkBox = uiFactory.getCheckBox();
        textField = uiFactory.getTextField();
        System.out.println(button);
        System.out.println(checkBox);
        System.out.println(textField);
    }

}
