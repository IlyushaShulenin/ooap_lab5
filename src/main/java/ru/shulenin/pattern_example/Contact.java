package ru.shulenin.pattern_example;

public interface Contact extends SeparatedNamePerson, SeparatedNumber {
    public String getName();
    public String getPhoneNumber();
}
