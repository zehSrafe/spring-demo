package be.intec.springdemo.service;

import be.intec.springdemo.service.StringProvider;

public class HelloMars implements StringProvider {
    @Override
    public String giveString() {
        return "Hello Mars!";
    }
}
