package be.intec.springdemo.service;

import org.springframework.context.ApplicationEvent;

public class CustomApplicationEvent extends ApplicationEvent {

    public CustomApplicationEvent(Object source) {
        super(source);
    }
}
