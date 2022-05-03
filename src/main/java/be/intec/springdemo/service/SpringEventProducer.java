package be.intec.springdemo.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component  // makes class a bean
public class SpringEventProducer {
//    @Autowired // fills in the property automatically. will search for a Bean that implements it e.g. Application context
    private ApplicationEventPublisher publisher;

    // same as @Autowired
    public SpringEventProducer(ApplicationEventPublisher publisher){
        this.publisher = publisher;
    }

    public void registerUser(String user) {
        this.publisher.publishEvent(new CustomApplicationEvent(user));
    }

    public void registerUser2(String user) {
        this.publisher.publishEvent(new CustomApplicationEvent(user));
    }
}
