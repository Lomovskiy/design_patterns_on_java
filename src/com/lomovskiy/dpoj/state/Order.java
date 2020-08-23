package com.lomovskiy.dpoj.state;

import com.lomovskiy.dpoj.state.states.State;
import org.jetbrains.annotations.NotNull;

public class Order {

    private @NotNull State currentState;

    public Order(@NotNull State initialState) {
        currentState = initialState;
    }

    public void changeState(@NotNull State state) {
        currentState = state;
    }

    public void handleInput(@NotNull InputType inputType) {
        try {
            currentState.handleInput(this, inputType);
        } catch (OrderException e) {
            System.out.println(e.getMessage());
        }
    }

}
