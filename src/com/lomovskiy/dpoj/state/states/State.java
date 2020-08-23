package com.lomovskiy.dpoj.state.states;

import com.lomovskiy.dpoj.state.InputType;
import com.lomovskiy.dpoj.state.Order;
import org.jetbrains.annotations.NotNull;

public interface State {

    void handleInput(@NotNull Order order,
                     @NotNull InputType inputType);

}
