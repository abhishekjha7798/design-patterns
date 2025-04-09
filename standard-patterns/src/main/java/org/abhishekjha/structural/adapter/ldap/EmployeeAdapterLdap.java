package org.abhishekjha.structural.adapter.ldap;

import org.abhishekjha.structural.adapter.Employee;

public class EmployeeAdapterLdap implements Employee {
    private final EmployeeLdap employeeFromLdap;

    public EmployeeAdapterLdap(EmployeeLdap employeeFromLdap) {
        this.employeeFromLdap = employeeFromLdap;
    }


    @Override
    public String getFirstName() {
        return employeeFromLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeFromLdap.getSurname();
    }

    @Override
    public String getId() {
        return employeeFromLdap.getCn();
    }

    @Override
    public String getEmail() {
        return employeeFromLdap.getMail();
    }

    public String toString() {
        return "ID: " + getId() + ", Name: " + getFirstName() + " " + getLastName() + ", Email: " + getEmail();
    }
}
