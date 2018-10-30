package Polymorphism;

public class Opel extends Car {

    public Opel(float cylidres, String name) {
        super(cylidres, name);
    }

    @Override
    public String getName() {
        System.out.println("Getter for Opel name");
        return this.name;
    }

    @Override
    public boolean isEnginge() {
        System.out.println("Getter for Opel engine");
        return this.enginge;
    }

    @Override
    public float getCylidres() {
        System.out.println("Getter for Opel cylinders");
        return this.cylidres;
    }

    @Override
    public int getWheels() {
        System.out.println("Getter for Opel wheels");
        return this.wheels;
    }

    @Override
    public void testCar() {
        super.testCar();
    }
}
