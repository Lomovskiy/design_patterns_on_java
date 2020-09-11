package com.lomovskiy.dpoj.behavioral.command.command;

import com.lomovskiy.dpoj.behavioral.command.receiver.Receiver;
import org.jetbrains.annotations.NotNull;

public class ConcreteCommand implements Command {

    private final @NotNull Receiver receiver;

    public ConcreteCommand(@NotNull Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.applyCommand(this);
    }

}
