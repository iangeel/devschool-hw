package OopPrinciplesChallenge;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private List<Additionals> additions = new ArrayList<>();
    private float price;
    private float finalPrice;

    public Hamburger(String name, String breadRollType, String meat, float price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.finalPrice = price;
    }

    public void addAdditional(Additionals additional) {
        if(this.additions.size() < 4) {
            this.additions.add(additional);
            this.finalPrice += additional.getAdditionalPrice();
        } else System.out.println("You can add up to 4 additions (lettuce, tomato, carrots, etc.)");
    }

    public int getAdditionsNumber() {
        return this.additions.size();
    }

    public List<Additionals> getAdditions() {
        return this.additions;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getFinalPrice() {
        return this.finalPrice;
    }


    public void showPriceDetail() {
       System.out.println("Base price: " + this.getPrice());

       for(Additionals addition : additions) {
           System.out.println("Addition: " + addition.getAdditionalName() + ", price: " + addition.getAdditionalPrice());
       }

       System.out.println("Grand final: " + this.getFinalPrice());

    }
}
