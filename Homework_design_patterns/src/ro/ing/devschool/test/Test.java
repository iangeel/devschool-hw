package ro.ing.devschool.test;

import ro.ing.devschool.PizzaStore;
import ro.ing.devschool.interfaces.PizzaTypes;
import ro.ing.devschool.utils.Client;
import ro.ing.devschool.utils.payments.Card;
import ro.ing.devschool.utils.payments.Cash;

public class Test {
    public static void main(String[] args) {
        Client client1 = new Client("Angel", new Cash());
        Client client2 = new Client("Popescu", new Card());
        Client client3 = new Client("Ionescu", new Cash());
        Client client4 = new Client("Gigel", new Card());
        Client client5 = new Client("Florin", new Card());

        PizzaStore pizzaStore = PizzaStore.getInstance("Emmily's Pizza");

        pizzaStore.placeOrder(client1, PizzaTypes.NewYorkPizza, true,
                false, false);
        pizzaStore.placeOrder(client2, PizzaTypes.ChicagoPizza, true,
                true, true);
        pizzaStore.placeOrder(client3, PizzaTypes.SmokedSalmonPizza, false,
                false, false);
        pizzaStore.placeOrder(client4, PizzaTypes.WhitePizza, false,
                true, false);
        pizzaStore.placeOrder(client5, PizzaTypes.VeganPizza, true,
                true, false);



        pizzaStore.showOrders();

        pizzaStore.sendOrder(client1);
        pizzaStore.sendOrder(client2);
        pizzaStore.sendOrder(client3);
        pizzaStore.sendOrder(client4);
        pizzaStore.sendOrder(client5);

    }
}
