package Composition;

public class Test {
    public static void main(String[] args) {
        Room livingRoom = new Room("livingroom",
                30f,
                new Armchair("lazy-boy", "red"),
                new Couch("IKEA", "brown", true),
                new Carpet("persan", "bej", 4f),
                new Television("Philips", 140f, true, true));

        System.out.println("Tv details:");
        System.out.println(livingRoom.getTvDetails());

        System.out.println();

        System.out.println("Access armchair via a getter and then its color");
        System.out.println(livingRoom.getArmchairDetails().getColor());
    }
}
