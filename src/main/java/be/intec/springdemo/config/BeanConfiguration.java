package be.intec.springdemo.config;

import be.intec.springdemo.service.HelloMars;
import be.intec.springdemo.service.HelloWorld;
import be.intec.springdemo.service.StringPrinter;
import be.intec.springdemo.service.StringProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeanConfiguration {
    @Bean
    @Profile("world")
    public StringProvider getStringProvider() {
        return new HelloWorld();
    }

    @Bean
    @Profile("mars")
    public StringProvider getMarsProvider() {
        return new HelloMars();
    }

    @Bean
    @Primary
    public StringPrinter printer(@Autowired(required = false) StringProvider provider) {
        StringPrinter printer;

        if (provider != null) {
            printer = new StringPrinter(provider);
        } else {
            printer = new StringPrinter(() -> "Hello from Bean config");
        }

        printer.print();
        return printer;
    }


}
