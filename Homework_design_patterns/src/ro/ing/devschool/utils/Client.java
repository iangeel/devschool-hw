package ro.ing.devschool.utils;

import ro.ing.devschool.interfaces.Observer;
import ro.ing.devschool.interfaces.PaymentMehtod;

public class Client implements Observer {
    private String name;
    private PaymentMehtod paymentMehtod;

    public Client(String name, PaymentMehtod paymentMehtod) {
        this.name = name;
        this.paymentMehtod = paymentMehtod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentMehtod getPaymentMehtod() {
        return paymentMehtod;
    }

    public void setPaymentMehtod(PaymentMehtod paymentMehtod) {
        this.paymentMehtod = paymentMehtod;
    }

    public void pays(double value) {
        paymentMehtod.pays(this.getName(), value);
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("!!! Hello, " + this.getName() + ". " +
                message);
    }
}
