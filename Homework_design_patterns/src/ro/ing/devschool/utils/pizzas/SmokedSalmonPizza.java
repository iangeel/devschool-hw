package ro.ing.devschool.utils.pizzas;

import java.util.List;

public class SmokedSalmonPizza extends Pizza {

    public SmokedSalmonPizza(List<String> ingredientsList,
                        boolean extraMozzarela,
                        boolean extraSalami,
                        boolean extraPepperocini) {
        super("Puck's Smoked Salmon", ingredientsList,35d, extraMozzarela, extraSalami, extraPepperocini);
    }
}
