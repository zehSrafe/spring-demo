package be.intec.springdemo.service;

public class HelloWorld implements StringProvider{
    @Override
    public String giveString() {
        System.out.println("Creating HelloWord string provider");
        return "Hello World";
    }
}
