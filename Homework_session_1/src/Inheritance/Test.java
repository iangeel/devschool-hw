package Inheritance;

public class Test {
    public static void main(String[] args) {
        Car myLada = new Lada("LADA",
                350,
                3000,
                4,
                0,
                "right",
                50,
                "Ladansky",
                "Russia");

        myLada.changeGear(6);
        myLada.handSteering("forward");
        myLada.movingSpeed(230f);

        System.out.println();
        System.out.println("My Lada: ");
        System.out.println("Gear: " + myLada.getGearNo() + " | Direction: " +
                myLada.getDirection() + " | Speed: " + myLada.getSpeed());

    }
}
