package ru.shulenin.pattern_example;

public class IncomeDataAdapter implements IncomeData {
    private Customer customer;
    private Contact contact;


    public IncomeDataAdapter(Customer customer, Contact contact) {
        this.customer = customer;
        this.contact = contact;
    }

    @Override
    public String getCountryCode() {
        return customer.getCountryName();
    }

    @Override
    public String getCompany() {
        return customer.getCompanyName();
    }

    @Override
    public String getContactFirstName() {
        return contact.getFirstName();
    }

    @Override
    public String getContactLastName() {
        return contact.getLastName();
    }

    @Override
    public int getCountryPhoneCode() {
        return contact.getCode();
    }

    @Override
    public int getPhoneNumber() {
        return contact.getNumber();
    }
}
