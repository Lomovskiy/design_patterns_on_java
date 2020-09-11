package com.lomovskiy.dpoj.behavioral.command.receiver;

import com.lomovskiy.dpoj.behavioral.command.command.Command;
import com.lomovskiy.dpoj.behavioral.command.command.ConcreteCommand;
import org.jetbrains.annotations.NotNull;

public class ReceiverImpl implements Receiver {

    @Override
    public void applyCommand(@NotNull Command command) {
        if (command instanceof ConcreteCommand) {
            System.out.println("Apply ConcreteCommand");
        }
    }

}
