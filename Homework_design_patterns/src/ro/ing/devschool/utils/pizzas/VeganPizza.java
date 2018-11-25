package ro.ing.devschool.utils.pizzas;

import java.util.List;

public class VeganPizza extends Pizza {

    public VeganPizza(List<String> ingredientsList,
                        boolean extraMozzarela,
                        boolean extraSalami,
                        boolean extraPepperocini) {
        super("Vegan Pizza", ingredientsList,15d, extraMozzarela, extraSalami, extraPepperocini);
    }
}
