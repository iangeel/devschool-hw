package OopPrinciplesChallenge;

public class HealthyBurger extends Hamburger {

    private float finalPrice;

    public HealthyBurger(String name, String breadRollType, String meat, float price) {
        super(name, breadRollType, meat, price);
        this.finalPrice = price;
    }

    @Override
    public void addAdditional(Additionals additionals) {
        if(this.getAdditionsNumber() < 6) {
            this.getAdditions().add(new Additionals(additionals.getAdditionalName(), additionals.getAdditionalPrice()));
            this.finalPrice += additionals.getAdditionalPrice();
        }
    }

    @Override
    public float getFinalPrice() {
        return this.finalPrice;
    }

    @Override
    public void showPriceDetail() {
        System.out.println("Base price: " + this.getPrice());
        String additionDetails = "";

        for(Additionals addition : this.getAdditions()) {
            System.out.println("Addition: " + addition.getAdditionalName() + ", price: " + addition.getAdditionalPrice());
        }

        System.out.println("Grand final: " + this.getFinalPrice());

    }
}
