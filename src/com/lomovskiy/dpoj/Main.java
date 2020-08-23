package com.lomovskiy.dpoj;

import com.lomovskiy.dpoj.state.states.AssignedState;
import com.lomovskiy.dpoj.state.InputType;
import com.lomovskiy.dpoj.state.Order;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        @NotNull Order order = new Order(new AssignedState());
        order.handleInput(InputType.PRESS_ADD_PHOTO_BUTTON);
        order.handleInput(InputType.PRESS_START_WORK_BUTTON);
        order.handleInput(InputType.PRESS_ADD_PHOTO_BUTTON);
        order.handleInput(InputType.PRESS_POSTPONE_BUTTON);
        order.handleInput(InputType.PRESS_ADD_PHOTO_BUTTON);
        order.handleInput(InputType.PRESS_ADD_PHOTO_BUTTON);
        order.handleInput(InputType.PRESS_END_WORK_BUTTON);
        order.handleInput(InputType.PRESS_START_WORK_BUTTON);
    }

}
