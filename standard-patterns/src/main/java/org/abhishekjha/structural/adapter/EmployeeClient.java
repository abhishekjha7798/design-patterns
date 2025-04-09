package org.abhishekjha.structural.adapter;

import org.abhishekjha.structural.adapter.csv.EmployeeAdapterCSV;
import org.abhishekjha.structural.adapter.csv.EmployeeCSV;
import org.abhishekjha.structural.adapter.ldap.EmployeeAdapterLdap;
import org.abhishekjha.structural.adapter.ldap.EmployeeLdap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB(
                "Marcus", "Aurelius", "1234", "marcus.aurelius@rome.com");

        employees.add(employeeFromDB);

        // This won't work! We need to adapt it

        // Employee employeeFromLdap = new EmployeeLdap(
        // "Augustus", "Caesar", "2345", "augustus.caesar@rome.com");

         EmployeeLdap employeeFromLdap = new EmployeeLdap(
         "Augustus", "Caesar", "2345", "augustus.caesar@rome.com");

        // We need to adapt the EmployeeLdap to Employee
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("Mark,Antony,567,mark.antony@rome.com");

        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }
}
