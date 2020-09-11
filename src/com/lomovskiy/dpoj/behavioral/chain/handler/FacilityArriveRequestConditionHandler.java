package com.lomovskiy.dpoj.behavioral.chain.handler;

import com.lomovskiy.dpoj.behavioral.chain.Request;
import com.lomovskiy.dpoj.behavioral.chain.RequestException;

public class FacilityArriveRequestConditionHandler extends RequestConditionHandler {

    public FacilityArriveRequestConditionHandler(RequestConditionHandler nextHandler) {
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
