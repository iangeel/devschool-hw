package ro.ing.devschool.utils.payments;

import ro.ing.devschool.interfaces.PaymentMehtod;

public class Cash implements PaymentMehtod {
    @Override
    public void pays(String clientName, double value) {
        System.out.println(clientName + " will pay " + value + " in cash.");
    }
}
