import Models.*;
import Service.*;

public class MainClass {
    public static void main(String[] args) {
        Smartphones androidPhone = new Androids();
        Smartphones iPhone = new iPhones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
    }
}
