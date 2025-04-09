package org.abhishekjha.structural.adapter.csv;

import java.util.StringTokenizer;

public class EmployeeCSV {
    private String firstName;
    private String lastName;
    private int id;
    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreTokens()) {
            firstName = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreTokens()) {
            lastName = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreTokens()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreTokens()) {
            emailAddress = tokenizer.nextToken();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
