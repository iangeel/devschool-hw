package ro.ing.devschool;

import ro.ing.devschool.helpers.PizzaBuilder;
import ro.ing.devschool.interfaces.Observer;
import ro.ing.devschool.interfaces.PizzaTypes;
import ro.ing.devschool.interfaces.Subject;
import ro.ing.devschool.utils.Client;
import ro.ing.devschool.utils.pizzas.Pizza;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class PizzaStore implements Subject {
    private static PizzaStore instance = null;
    private String storeName;
    private HashMap<Client, Pizza> orders;
    private List<Observer> clients;


    private PizzaStore(String storeName) {
        this.orders = new HashMap<>();
        this.clients = new LinkedList<>();
        this.storeName = storeName;
    }

    public static PizzaStore getInstance(String storeName) {
        if(instance == null) {
            synchronized (PizzaStore.class) {
                if(instance == null) {
                    instance = new PizzaStore(storeName);
                }
            }
        }

        return instance;
    }


    public void placeOrder(Client client,
                           PizzaTypes pizzaType,
                           boolean extraMozzarela,
                           boolean extraPepperocini,
                           boolean extraSalami) {



        PizzaBuilder builder = new PizzaBuilder(pizzaType);
        Pizza pizza;
        if(!extraMozzarela && !extraPepperocini && !extraSalami) {
            pizza = builder.cook();
        } else {
            if(extraMozzarela) {
                builder.addExtraMozzarela();
            }
            if(extraPepperocini) {
                builder.addExtraPepperocini();
            }
            if(extraSalami) {
                builder.addExtraSalami();
            }

            pizza = builder.cook();
        }
        client.pays(pizza.getValue());
        orders.put(client, pizza);
    }

    public void showOrders() {
        if(orders != null) {
            orders.forEach((client, pizza) ->
                    System.out.println("\n" + client.getName() + ": " + pizza.pizzaDetails()));
        }
    }

    public void sendOrder(Client client) {
        addClient(client);
        Pizza pizza = orders.remove(client);
        if(pizza != null) {
            notifyClient("Your " + pizza.getName() + "(" + pizza.getValue() + " RON)" +
                    "is ready to be delivered.");
            removeClient(client);
        }
    }


    @Override
    public void addClient(Observer client) {
        clients.add(client);
    }

    @Override
    public void removeClient(Observer client) {
        clients.remove(client);
    }

    @Override
    public void notifyClient(String message) {
        for(Observer client : clients) {
            client.receiveNotification(message);
        }
    }
}
