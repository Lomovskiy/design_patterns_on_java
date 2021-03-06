package com.lomovskiy.dpoj.behavioral.state.states;

import com.lomovskiy.dpoj.behavioral.state.InputType;
import com.lomovskiy.dpoj.behavioral.state.Order;
import com.lomovskiy.dpoj.behavioral.state.OrderException;
import org.jetbrains.annotations.NotNull;

public class ServicedState implements State {

    @Override
    public void handleInput(@NotNull Order order,
                            @NotNull InputType inputType) {
        throw new OrderException("Заяка уже закрыта");
    }

}
