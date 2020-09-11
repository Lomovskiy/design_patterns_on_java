package com.lomovskiy.dpoj.behavioral.state;

import org.jetbrains.annotations.NotNull;

public class OrderException extends RuntimeException {

    private final @NotNull String message;

    public OrderException(@NotNull String message) {
        this.message = message;
    }

    @Override
    public @NotNull String getMessage() {
        return message;
    }

}
