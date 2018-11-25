package ro.ing.devschool.utils.payments;

import ro.ing.devschool.interfaces.PaymentMehtod;

public class Card implements PaymentMehtod {
    @Override
    public void pays(String clientName, double value) {
        System.out.println(clientName + " paid " + value + " with his card.");
    }
}
