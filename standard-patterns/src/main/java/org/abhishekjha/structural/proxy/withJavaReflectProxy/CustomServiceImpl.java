package org.abhishekjha.structural.proxy.withJavaReflectProxy;

public class CustomServiceImpl implements CustomService {
    @Override
    public void doServiceCall() {
        System.out.println("Actual Service call executed");
    }
}
