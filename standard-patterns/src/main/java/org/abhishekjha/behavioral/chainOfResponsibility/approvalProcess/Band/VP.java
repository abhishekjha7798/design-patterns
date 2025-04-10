package org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Band;

import org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Handler;
import org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Request;
import org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.RequestType;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.requestType() == RequestType.PURCHASE) {
            if (request.amount() < 100_000) {
                // Approve purchase request
                System.out.println("VP approved purchase request of amount: " + request.amount());
            } else if (request.amount() < 500_000) {
                // Forward to CEO for approval
                successor.handleRequest(request);
            } else {
                // Reject request
                System.out.println("VP rejected purchase request of amount: " + request.amount());
            }
        }
    }
}
