package org.abhishekjha.structural.proxy.securityProxy;

public class ProxySecurityDemo {
    public static void main(String[] args) {
        // Using proxy, we have passed the username and role to check the access but
        // the actual resource is not aware of the username and role.

        SensitiveResource proxy = new SecurityProxy("abhishek.jha", "admin");

        // Accessing the resource with correct role
        proxy.accessResource();

        // Attempting to access the resource with an incorrect role
        SensitiveResource proxyWithWrongRole = new SecurityProxy("abhishek.jha", "guest");
        proxyWithWrongRole.accessResource();
    }
}
