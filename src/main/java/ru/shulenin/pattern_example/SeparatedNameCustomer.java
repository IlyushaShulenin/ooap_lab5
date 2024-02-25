package ru.shulenin.pattern_example;


import org.springframework.stereotype.Component;

public class SeparatedNameCustomer implements SeparatedNamePerson {
    public String firstname;
    public String lastname;


    public SeparatedNameCustomer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String getFirstName() {
        return firstname;
    }

    @Override
    public String getLastName() {
        return lastname;
    }
}
