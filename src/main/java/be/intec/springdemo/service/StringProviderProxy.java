package be.intec.springdemo.service;

public class StringProviderProxy implements StringProvider {
    private StringProvider provider;

    @Override
    public String giveString() {
        if (this.provider == null) {
            this.provider = new HelloMars();
        }
        return this.provider.giveString();
    }
}
