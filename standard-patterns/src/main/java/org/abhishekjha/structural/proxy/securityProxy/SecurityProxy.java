package org.abhishekjha.structural.proxy.securityProxy;

public class SecurityProxy implements SensitiveResource {
    private ActualSensitiveResource sensitiveResource;
    private final String userName;
    private final String userRole;

    public SecurityProxy(String username, String userRole) {
        this.userName = username;
        this.userRole = userRole;
    }

    private boolean checkAccess() {
        // Simulate a security check
        if (userRole.equals("admin")) {
            return true;
        } else {
            System.out.println("Access denied: insufficient permissions for user " + userName);
            return false;
        }
    }

    @Override
    public void accessResource() {
        if (checkAccess()) {
            // Lazy initialization of the actual resource
            if (sensitiveResource == null) {
                sensitiveResource = new ActualSensitiveResource();
            }
            sensitiveResource.accessResource();
        }
    }
}
