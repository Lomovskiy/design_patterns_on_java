package com.lomovskiy.dpoj;

import com.lomovskiy.dpoj.chain.Request;
import com.lomovskiy.dpoj.chain.RequestException;
import com.lomovskiy.dpoj.chain.handler.*;
import com.sun.istack.internal.NotNull;

public class Main {

    public static void main(String[] args) {
        final @NotNull Request request = new Request();
        final RequestConditionHandler locationConditionHandler = new LocationRequestConditionHandler(null);
        final RequestConditionHandler facilityArriveConditionHandler = new FacilityArriveRequestConditionHandler(locationConditionHandler);
        final RequestConditionHandler jobArriveConditionHandler = new JobArriveRequestConditionHandler(facilityArriveConditionHandler);
        final RequestConditionHandler statusConditionHandler = new StatusRequestConditionHandler(jobArriveConditionHandler);

        try {
            statusConditionHandler.checkCondition(request);
        } catch (RequestException e) {

        }
    }

}
