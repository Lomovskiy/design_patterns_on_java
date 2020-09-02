package com.lomovskiy.dpoj.chain.handler;

import com.lomovskiy.dpoj.chain.Request;
import com.lomovskiy.dpoj.chain.RequestException;

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
