package com.lomovskiy.dpoj.behavioral.state.states;

import com.lomovskiy.dpoj.behavioral.state.InputType;
import com.lomovskiy.dpoj.behavioral.state.Order;
import com.lomovskiy.dpoj.behavioral.state.OrderException;
import org.jetbrains.annotations.NotNull;

public class InProgressState implements State {

    @Override
    public void handleInput(@NotNull Order order,
                            @NotNull InputType inputType) {
        switch (inputType) {
            case PRESS_START_WORK_BUTTON: {
                throw new OrderException("Заяка уже в работе");
            }
            case PRESS_ADD_PHOTO_BUTTON: {
                System.out.println("Добавлена фотография в заявку");
                break;
            }
            case PRESS_END_WORK_BUTTON: {
                System.out.println("Заявка закрыта");
                order.changeState(new ServicedState());
                break;
            }
            case PRESS_POSTPONE_BUTTON: {
                System.out.println("Заявка отложена");
                order.changeState(new PostponedState());
                break;
            }
        }
    }

}
