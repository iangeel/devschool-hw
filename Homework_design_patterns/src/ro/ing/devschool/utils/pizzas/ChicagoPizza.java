package ro.ing.devschool.utils.pizzas;

import java.util.List;

public class ChicagoPizza extends Pizza {

    public ChicagoPizza(List<String> ingredientsList,
                        boolean extraMozzarela,
                        boolean extraSalami,
                        boolean extraPepperocini) {
        super("Chicago", ingredientsList,30d, extraMozzarela, extraSalami, extraPepperocini);
    }


}
