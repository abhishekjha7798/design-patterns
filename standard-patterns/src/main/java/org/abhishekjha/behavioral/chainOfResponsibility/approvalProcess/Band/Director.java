package org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Band;

import org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Handler;
import org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Request;
import org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.RequestType;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.requestType() == RequestType.CONFERENCE) {
            System.out.println("Director approved conference request of amount: " + request.amount());
        } else {
            successor.handleRequest(request);
        }
    }
}
