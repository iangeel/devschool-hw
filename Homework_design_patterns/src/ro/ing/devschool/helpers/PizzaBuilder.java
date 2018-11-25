package ro.ing.devschool.helpers;

import ro.ing.devschool.interfaces.Builder;
import ro.ing.devschool.interfaces.PizzaTypes;
import ro.ing.devschool.utils.pizzas.Pizza;

public class PizzaBuilder implements Builder {
    private Pizza pizza;

    public PizzaBuilder(PizzaTypes pizzaType) {
        pizza = new PizzaFactory().orderPizza(pizzaType);
    }

    public PizzaBuilder addExtraMozzarela() {
        this.pizza.setExtraMozzarela(true);
        this.pizza.setValue(this.pizza.getValue() + 1);
        return this;
    }

    public PizzaBuilder addExtraSalami() {
        this.pizza.setExtraSalami(true);
        this.pizza.setValue(this.pizza.getValue() + 2);
        return this;
    }

    public PizzaBuilder addExtraPepperocini() {
        this.pizza.setExtraPepperocini(true);
        this.pizza.setValue(this.pizza.getValue() + 1.5d);
        return this;
    }


    @Override
    public Pizza cook() {
        return pizza;
    }
}
