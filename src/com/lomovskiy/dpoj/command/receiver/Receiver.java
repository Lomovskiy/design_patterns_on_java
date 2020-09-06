package com.lomovskiy.dpoj.command.receiver;

import com.lomovskiy.dpoj.command.command.Command;
import org.jetbrains.annotations.NotNull;

public interface Receiver {

    void applyCommand(@NotNull Command command);

}
