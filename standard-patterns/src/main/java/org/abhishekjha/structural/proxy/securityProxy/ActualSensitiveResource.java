package org.abhishekjha.structural.proxy.securityProxy;

public class ActualSensitiveResource implements SensitiveResource {
    @Override
    public void accessResource() {
        System.out.println("Sensitive resource accessed");
    }
}
