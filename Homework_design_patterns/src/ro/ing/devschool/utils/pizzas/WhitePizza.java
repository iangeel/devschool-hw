package ro.ing.devschool.utils.pizzas;

import java.util.List;

public class WhitePizza extends Pizza {

    public WhitePizza(List<String> ingredientsList,
                        boolean extraMozzarela,
                        boolean extraSalami,
                        boolean extraPepperocini) {
        super("White/Bianca Pizza", ingredientsList,12d, extraMozzarela, extraSalami, extraPepperocini);
    }
}
