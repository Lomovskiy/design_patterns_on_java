package com.lomovskiy.dpoj.behavioral.command.receiver;

import com.lomovskiy.dpoj.behavioral.command.command.Command;
import org.jetbrains.annotations.NotNull;

public interface Receiver {

    void applyCommand(@NotNull Command command);

}
