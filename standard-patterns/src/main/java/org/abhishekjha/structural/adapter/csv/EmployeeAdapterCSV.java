package org.abhishekjha.structural.adapter.csv;

import org.abhishekjha.structural.adapter.Employee;

public class EmployeeAdapterCSV implements Employee {
    private final EmployeeCSV employeeFromCSV;

    public EmployeeAdapterCSV(EmployeeCSV employeeFromCSV) {
        this.employeeFromCSV = employeeFromCSV;
    }


    @Override
    public String getFirstName() {
        return employeeFromCSV.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeFromCSV.getLastName();
    }

    @Override
    public String getId() {
        return String.valueOf(employeeFromCSV.getId());
    }

    @Override
    public String getEmail() {
        return employeeFromCSV.getEmailAddress();
    }

    public String toString() {
        return "ID: " + getId() + ", Name: " + getFirstName() + " " + getLastName() + ", Email: " + getEmail();
    }
}
