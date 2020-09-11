package com.lomovskiy.dpoj.behavioral.command;

import com.lomovskiy.dpoj.behavioral.command.command.Command;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Invoker {

    private @Nullable Command command;

    public void setCommand(@NotNull Command command) {
        this.command = command;
    }

    public void run() {
        if (command != null) {
            command.execute();
        }
    }

}
