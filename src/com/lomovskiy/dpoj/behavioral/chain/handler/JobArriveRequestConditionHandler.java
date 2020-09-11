package com.lomovskiy.dpoj.behavioral.chain.handler;

import com.lomovskiy.dpoj.behavioral.chain.Request;
import com.lomovskiy.dpoj.behavioral.chain.RequestException;

public class JobArriveRequestConditionHandler extends RequestConditionHandler {

    public JobArriveRequestConditionHandler(RequestConditionHandler nextHandler) {
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
