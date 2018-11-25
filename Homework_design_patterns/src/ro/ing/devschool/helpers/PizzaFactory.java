package ro.ing.devschool.helpers;

import ro.ing.devschool.interfaces.Constants;
import ro.ing.devschool.interfaces.PizzaTypes;
import ro.ing.devschool.utils.pizzas.*;

public class PizzaFactory {

    public Pizza orderPizza(PizzaTypes pizzaTypes) {
        switch (pizzaTypes) {
            case NewYorkPizza:
                return new NewYourPizza(Constants.newYorkIngredients,
                        false,
                        false,
                        false);
            case ChicagoPizza:
                return new ChicagoPizza(Constants.chicagoIngredients,
                        false,
                        false,
                        false);
            case SmokedSalmonPizza:
                return new SmokedSalmonPizza(Constants.smokedSalmonIngredients,
                        false,
                        false,
                        false);
            case WhitePizza:
                return new WhitePizza(Constants.whiteIngredients,
                        false,
                        false,
                        false);
            case VeganPizza:
                return new VeganPizza(Constants.veganIngredients,
                        false,
                        false,
                        false);
                default:
                    return new NewYourPizza(Constants.newYorkIngredients,
                            false,
                            false,
                            false);
        }
    }
}
