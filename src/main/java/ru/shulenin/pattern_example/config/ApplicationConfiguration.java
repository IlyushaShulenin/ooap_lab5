package ru.shulenin.pattern_example.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.shulenin.pattern_example.*;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfiguration {

    private final ApplicationContext context;

    @Bean
    public SeparatedNamePerson person(@Value("${data.person.firstname}") String firstname,
                                      @Value("${data.person.lastname}") String lastname) {
        return new SeparatedNameCustomer(firstname, lastname);
    }

    @Bean
    public SeparatedNumber phoneNumber(@Value("${data.phone.code}") int code,
                                       @Value("${data.phone.number}") int number) {
        return new SeparatedPhoneNumber(code, number);
    }

    @Bean
    public Contact contact() {
        var person = context.getBean("person", SeparatedNameCustomer.class);
        var phoneNumber = context.getBean("phoneNumber", SeparatedPhoneNumber.class);

        return new ContactImpl(person, phoneNumber);
    }

    @Bean
    public Customer customer( @Value("${data.customer.company}") String company,
                              @Value("${data.customer.country}") String country) {
        return new CustomerImpl(company, country);
    }

    @Bean
    public IncomeData data() {
        var customer = context.getBean("customer", CustomerImpl.class);

        return new IncomeDataAdapter(customer, contact());
    }
}
