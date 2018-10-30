package Polymorphism;

public class Car {
    protected String name;
    protected boolean enginge;
    protected float cylidres;
    protected int wheels;

    public Car() {}

    public Car(float cylidres, String name) {
        this.cylidres = cylidres;
        this.name = name;
        this.enginge = true;
        this.wheels = 4;
    }

    public String getName() {
        System.out.println("Getter for car name");
        return name;
    }

    public boolean isEnginge() {
        System.out.println("Getter for car enginge");
        return enginge;
    }

    public float getCylidres() {
        System.out.println("Getter for car cylidres");
        return cylidres;
    }

    public int getWheels() {
        System.out.println("Getter for car wheels");
        return wheels;
    }

    public void testCar() {
        System.out.println();
        System.out.println();
        System.out.print(this.getName() + " has " + this.getCylidres() + "cc, " +
                this.getWheels() + " wheels");
        if(this.enginge) {
            System.out.print(" and an enginge.");
        }
    }
}
