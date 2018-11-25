package ro.ing.devschool.utils.pizzas;

import java.util.List;

public class NewYourPizza extends Pizza {

    public NewYourPizza(List<String> ingredientsList,
                        boolean extraMozzarela,
                        boolean extraSalami,
                        boolean extraPepperocini) {
        super("New York", ingredientsList,25d, extraMozzarela, extraSalami, extraPepperocini);
    }

}
