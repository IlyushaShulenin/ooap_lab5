package ru.shulenin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.shulenin.pattern_example.*;
import ru.shulenin.pattern_example.*;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        var context = SpringApplication.run(Main.class, args);

        IncomeData data = context.getBean("data", IncomeDataAdapter.class);

        System.out.println(data.getCompany());
        System.out.println(data.getContactFirstName());
        System.out.println(data.getContactLastName());
        System.out.println(data.getCountryCode());
        System.out.println(data.getCountryPhoneCode());
        System.out.println(data.getPhoneNumber());

    }
}
