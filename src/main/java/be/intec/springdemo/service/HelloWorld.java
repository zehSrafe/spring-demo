package be.intec.springdemo.service;

public class HelloWorld implements StringProvider{
    @Override
    public String giveString() {
        return "Hello World";
    }
}
