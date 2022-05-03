package be.intec.springdemo.service;

import java.util.List;

public class EventProducer {
//    private InterestedClass1 interestedClass1;
//    private InterestedClass2 interestedClass2;
//    private InterestedClass3 interestedClass3;

    private List<Interested> interestedClasses;

    public void registerdUser(String user) {
        interestedClasses.forEach(ic -> ic.newUserRegistered(user));
    }

//    public void registerUser(String user) {
//        // usual way of sending signals to other class
//        interestedClass1.newUserRegistered(user);
//        interestedClass2.newUserRegistered(user);
//        interestedClass3.newUserRegistered(user);
//    }
}
