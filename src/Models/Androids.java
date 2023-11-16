package Models;
import Service.*;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Calling from Android");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from Android");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet from Android");
    }

    @Override
    public void runCommand() {
        System.out.println("Running Linux command from Android");
    }
}
