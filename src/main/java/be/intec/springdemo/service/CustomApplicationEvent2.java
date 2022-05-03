package be.intec.springdemo.service;

import org.springframework.context.ApplicationEvent;

public class CustomApplicationEvent2 extends ApplicationEvent {

    public CustomApplicationEvent2(Object source) {
        super(source);
    }
}
