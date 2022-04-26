package be.intec.springdemo.service;

public class StringPrinter {
    private StringProvider provider;

    public StringPrinter(StringProvider provider) {
        this.provider = provider;
    }

    public void print() {
        System.out.println(provider.giveString());
    }
}
