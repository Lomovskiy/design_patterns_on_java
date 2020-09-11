package com.lomovskiy.dpoj.behavioral.chain.handler;

import com.lomovskiy.dpoj.behavioral.chain.Request;
import com.lomovskiy.dpoj.behavioral.chain.RequestException;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public abstract class RequestConditionHandler {

    final @Nullable RequestConditionHandler nextHandler;

    public RequestConditionHandler(@Nullable RequestConditionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void checkCondition(@NotNull Request request) throws RequestException;

}
