package ru.shulenin.pattern_example;


import org.springframework.stereotype.Component;

public class SeparatedPhoneNumber implements SeparatedNumber {
    private int code;
    private int number;

    public SeparatedPhoneNumber(int code, int number) {
        this.code = code;
        this.number = number;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
