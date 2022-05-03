package be.intec.springdemo.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InterestedClass2{
//    public void newUserRegistered(String user){
//        // do stuff (not important to make this functional)
//    }

//    @Override
//    public void newUserRegistered(String user) {
//        // same as above but from interface implementation
//    }

    @EventListener
    public void toDoWhenEventComesIn(CustomApplicationEvent event) { // CustomApplicationEvent will pickup any CustomApplicationEvent event
        // Do stuff
        System.out.println("Got event in class 2: " + event);
    }

    // will now pickup events from CustomApplicationEvent and CustomApplicationEvent2
    @EventListener
    public void toDoWhenEventComesIn(CustomApplicationEvent2 event) { // CustomApplicationEvent will pickup any CustomApplicationEvent event
        // Do stuff
        System.out.println("Got event in class 2: " + event);
    }
}
