package be.intec.springdemo;

import be.intec.springdemo.service.StringPrinter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {
    public static void main(String[] args) {
        // will use active profile. if no profile defined then will fill from beanconfig
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
