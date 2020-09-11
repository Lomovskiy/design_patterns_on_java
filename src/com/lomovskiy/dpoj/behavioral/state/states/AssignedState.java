package com.lomovskiy.dpoj.behavioral.state.states;

import com.lomovskiy.dpoj.behavioral.state.InputType;
import com.lomovskiy.dpoj.behavioral.state.Order;
import com.lomovskiy.dpoj.behavioral.state.OrderException;
import org.jetbrains.annotations.NotNull;

public class AssignedState implements State {

    @Override
    public void handleInput(@NotNull Order order,
                            @NotNull InputType inputType) {
        switch (inputType) {
            case PRESS_START_WORK_BUTTON: {
                System.out.println("Заявка в работе");
                order.changeState(new InProgressState());
                break;
            }
            case PRESS_ADD_PHOTO_BUTTON: {
                throw new OrderException("Пока нельзя добавить фотографию к заявке");
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
