package be.intec.springdemo;

import be.intec.springdemo.service.SpringEventProducer;
import be.intec.springdemo.service.StringPrinter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {
    public static void main(String[] args) {
        // will use active profile. if no profile defined then will fill from beanconfig class
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringDemoApplication.class, args);

        SpringEventProducer sep = ctx.getBean(SpringEventProducer.class);
        sep.registerUser("wait");
        sep.registerUser2("nonsense");
    }

}
