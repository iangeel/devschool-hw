package ro.ing.devschool.interfaces;

import java.util.Arrays;
import java.util.List;

public interface Constants {
    String mozzarela = "Mozzarela";
    String salami = "Salami";
    String pepperocini = "Pepperocini";
    String tomatoSauce = "Tomato Sauce";
    String oregano = "oregano";
    String chilliFlakes = "Chilli flakes";
    String freshTomatoSauce = "Fresh tomato sauce";
    String cremeFraiche = "Creme fraiche";
    String smokedSalmon = "Smoked salmon";
    String blackCaviar = "Black caviar";
    String garlic = "Garlic";
    String ricotta = "Ricotta";
    String romaine = "Romaine";
    String cucumbers = "Cucumbers";
    String tomatoes = "Tomatoes";
    String feta = "Feta";
    String olives = "Olives";

    List<String> newYorkIngredients = Arrays.asList(
            tomatoSauce,
            mozzarela,
            oregano,
            chilliFlakes
    );

    List<String> chicagoIngredients = Arrays.asList(
            mozzarela,
            freshTomatoSauce,
            pepperocini,
            salami
    );

    List<String> smokedSalmonIngredients = Arrays.asList(
            cremeFraiche,
            smokedSalmon,
            blackCaviar
    );

    List<String> whiteIngredients = Arrays.asList(
            mozzarela,
            garlic,
            ricotta
    );

    List<String> veganIngredients = Arrays.asList(
            romaine,
            cucumbers,
            tomatoes,
            feta,
            olives
    );


}
