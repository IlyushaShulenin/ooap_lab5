package ru.shulenin.pattern_example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ContactImpl implements Contact {
    private SeparatedNamePerson customer;
    private SeparatedNumber phoneNumber;


    public ContactImpl(@Qualifier("person") SeparatedNamePerson customer, @Qualifier("phoneNumber") SeparatedNumber phoneNumber) {
        this.customer = customer;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return customer.getFirstName().concat(" " + customer.getLastName());
    }

    @Override
    public String getPhoneNumber() {
        return String.valueOf(phoneNumber.getCode()) + " "
                + String.valueOf(phoneNumber.getNumber());
    }

    @Override
    public String getFirstName() {
        return customer.getFirstName();
    }

    @Override
    public String getLastName() {
        return customer.getLastName();
    }

    @Override
    public int getCode() {
        return phoneNumber.getCode();
    }

    @Override
    public int getNumber() {
        return phoneNumber.getNumber();
    }
}
