package OopPrinciplesChallenge;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String name, String breadRollType, String meat, float price) {
        super(name, breadRollType, meat, price);
        this.getAdditions().add(new Additionals("chips", 1));
        this.getAdditions().add(new Additionals("drink", 1.5f));
    }

    @Override
    public void addAdditional(Additionals additionals) {
        System.out.println("You cant add anything on you Deluxe Burger...");
    }

    @Override
    public void showPriceDetail() {
        System.out.println("Base price: " + this.getPrice());


        System.out.println("Grand final: " + this.getFinalPrice());

    }
}
