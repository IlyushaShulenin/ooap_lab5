package ru.shulenin.pattern_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CustomerImpl implements Customer {
    private String companyName;
    private String countryName;


    public CustomerImpl(String companyName, String countryName) {
        this.companyName = companyName;
        this.countryName = countryName;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getCountryName() {
        return countryName;
    }

    @Override
    public String getCountryCode() {
        return null;
    }
}
