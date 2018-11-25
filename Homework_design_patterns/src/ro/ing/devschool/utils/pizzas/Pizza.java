package ro.ing.devschool.utils.pizzas;

import ro.ing.devschool.interfaces.Constants;


import java.util.List;

public class Pizza {
    private String name;
    private List<String> ingredientsList;
    private double value;
    private boolean extraMozzarela;
    private boolean extraSalami;
    private boolean extraPepperocini;


    public Pizza(String name,
                 List<String> ingredientsList,
                 double value,
                 boolean extraMozzarela,
                 boolean extraSalami,
                 boolean extraPepperocini) {
        this.name = name;
        this.value = value;
        this.ingredientsList = ingredientsList;
        this.extraMozzarela = extraMozzarela;
        this.extraSalami = extraSalami;
        this.extraPepperocini = extraPepperocini;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<String> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public boolean isExtraMozzarela() {
        return extraMozzarela;
    }

    public void setExtraMozzarela(boolean extraMozzarela) {
        this.extraMozzarela = extraMozzarela;
    }

    public boolean isExtraSalami() {
        return extraSalami;
    }

    public void setExtraSalami(boolean extraSalami) {
        this.extraSalami = extraSalami;
    }

    public boolean isExtraPepperocini() {
        return extraPepperocini;
    }

    public void setExtraPepperocini(boolean extraPepperocini) {
        this.extraPepperocini = extraPepperocini;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String pizzaDetails() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pizza " + this.getName() + " costs " + this.getValue() +".");
        stringBuilder.append("\nIngredients: ");
        if(this.getIngredientsList() != null) {
            for (String ingredient : this.getIngredientsList()) {
                stringBuilder.append("\n\t- " + ingredient);
            }
        }
        if(this.isExtraMozzarela()) stringBuilder.append("\n\t*** Extra mozzarela");
        if(this.isExtraPepperocini()) stringBuilder.append("\n\t*** Extra pepperocini");
        if(this.isExtraSalami()) stringBuilder.append("\n\t*** Extra salami");

        return stringBuilder.toString();
    }

}
