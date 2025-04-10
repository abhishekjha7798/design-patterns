package org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess;

import org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Band.CEO;
import org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Band.Director;
import org.abhishekjha.behavioral.chainOfResponsibility.approvalProcess.Band.VP;

public class Demo {
    public static void main(String[] args) {
        // Create handlers
        Handler abhishek = new Director();
        Handler puneet = new VP();
        Handler reggie = new CEO();

        // Set up the chain of responsibility
        abhishek.setSuccessor(puneet);
        puneet.setSuccessor(reggie);

        // Create requests
        Request conferenceRequest = new Request(RequestType.CONFERENCE, 2_00_000);
        Request purchaseRequest = new Request(RequestType.PURCHASE, 2_00_000);
        Request largePurchaseRequest = new Request(RequestType.PURCHASE, 8_00_000);

        // Process requests
        abhishek.handleRequest(conferenceRequest);
        abhishek.handleRequest(purchaseRequest);
        abhishek.handleRequest(largePurchaseRequest);
    }
}
