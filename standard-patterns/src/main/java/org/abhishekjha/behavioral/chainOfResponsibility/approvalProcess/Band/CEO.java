package org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Band;

import org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Handler;
import org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Request;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO approved request of type: " + request.requestType() + " with amount: "
                + request.amount());
    }
}
