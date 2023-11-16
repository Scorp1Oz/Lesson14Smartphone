package Models;
import Service.*;

public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Calling from iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet from iPhone");
    }

    @Override
    public void runApp() {
        System.out.println("Running iOS app from iPhone");
    }
}
