package be.intec.springdemo.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component // makes it a bean. is needed for event listener
public class InterestedClass1 {

    @EventListener
    public void toDoWhenEventComesIn(Object event) { // Object will pickup any event
        // Do stuff
        System.out.println("Got event in class 1 event: " + event);
    }
}
