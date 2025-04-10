package org.abhishekjha.structural.proxy.withJavaReflectProxy;

import java.lang.reflect.Proxy;

public class InvocationHandlerDemo {
    public static void main(String[] args) {
        CustomService service = new CustomServiceImpl();
        // we can also use the service directly without proxy, but say we want to add some additional functionality
        // like logging, security checks, etc. before or after the actual method call
        // so we create a proxy instance of the service
        service.doServiceCall();
        CustomInvocationHandler<CustomService> customInvocationHandler = new CustomInvocationHandler<>(service);
        CustomService proxyInstance = (CustomService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                customInvocationHandler
        );

        proxyInstance.doServiceCall();
    }
}
