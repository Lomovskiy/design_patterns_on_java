package com.lomovskiy.dpoj;

import com.lomovskiy.dpoj.command.Invoker;
import com.lomovskiy.dpoj.command.command.Command;
import com.lomovskiy.dpoj.command.command.ConcreteCommand;
import com.lomovskiy.dpoj.command.receiver.Receiver;
import com.lomovskiy.dpoj.command.receiver.ReceiverImpl;
import com.sun.istack.internal.NotNull;

public class Main {

    public static void main(String[] args) {
        final @NotNull Invoker invoker = new Invoker();
        final @NotNull Receiver receiver = new ReceiverImpl();
        final @NotNull Command command = new ConcreteCommand(receiver);
        invoker.setCommand(command);
        invoker.run();
    }

}
