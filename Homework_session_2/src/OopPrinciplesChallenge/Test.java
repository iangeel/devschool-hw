package OopPrinciplesChallenge;

public class Test {
    public static void main(String[] args) {
        Additionals lettuce = new Additionals("lettuce", 1);
        Additionals tomatto = new Additionals("tomatto", 1.2f);
        Additionals carrot = new Additionals("carrot", 1.3f);
        Additionals cuccumber = new Additionals("cuccumber", 1.4f);
        Additionals onion = new Additionals("onion", 1.5f);
        Additionals cheese = new Additionals("cheese", 1.6f);


        System.out.println();
        System.out.println("Adding more than the max number of additionals permited:");

        Hamburger simpleHam = new Hamburger("BigMac", "simple", "beef", 10);
        simpleHam.addAdditional(lettuce);
        simpleHam.addAdditional(tomatto);
        simpleHam.addAdditional(carrot);
        simpleHam.addAdditional(cuccumber);
        simpleHam.addAdditional(onion);



        Hamburger healthyBurger = new HealthyBurger("Healthy Burger", "healthy", "chicken", 12);
        healthyBurger.addAdditional(lettuce);
        healthyBurger.addAdditional(tomatto);
        healthyBurger.addAdditional(carrot);
        healthyBurger.addAdditional(cuccumber);
        healthyBurger.addAdditional(onion);
        healthyBurger.addAdditional(cheese);

        Hamburger deluxeBurger = new DeluxeBurger("Royal Deluxe", "deluxe", "beef", 15);
        deluxeBurger.addAdditional(lettuce);

        System.out.println();
        System.out.println("NORMAL BURGER");
        simpleHam.showPriceDetail();

        System.out.println();
        System.out.println("HEALTHY BURGER");
        healthyBurger.showPriceDetail();

        System.out.println();
        System.out.println("DELUXE BURGER");
        deluxeBurger.showPriceDetail();
    }
}
