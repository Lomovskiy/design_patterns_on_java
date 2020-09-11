package com.lomovskiy.dpoj.behavioral.state.states;

import com.lomovskiy.dpoj.behavioral.state.InputType;
import com.lomovskiy.dpoj.behavioral.state.Order;
import org.jetbrains.annotations.NotNull;

public interface State {

    void handleInput(@NotNull Order order,
                     @NotNull InputType inputType);

}
