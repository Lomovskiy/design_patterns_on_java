package com.lomovskiy.dpoj.chain.handler;

import com.lomovskiy.dpoj.chain.Request;
import com.lomovskiy.dpoj.chain.RequestException;

public class StatusRequestConditionHandler extends RequestConditionHandler {

    public StatusRequestConditionHandler(RequestConditionHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void checkCondition(Request request) throws RequestException {
        // check some condition ...
        if (nextHandler != null) {
            nextHandler.checkCondition(request);
        }
    }

}
