package Polymorphism;

public class Bmw extends Car {

    private boolean mPackage;

    public Bmw(float cylidres, String name, boolean mPackage) {
        super(cylidres,name);
        this.mPackage = mPackage;
    }

    @Override
    public String getName() {
        System.out.println("Getter for BMW name");
        return this.name;
    }

    @Override
    public boolean isEnginge() {
        System.out.println("Getter for BMW engine");
        return this.enginge;
    }

    @Override
    public float getCylidres() {
        System.out.println("Getter for BMW cylinders");
        return this.cylidres;
    }

    @Override
    public int getWheels() {
        System.out.println("Getter for BMW wheels");
        return this.wheels;
    }

    @Override
    public void testCar() {
        super.testCar();
        if(this.mPackage) {
            System.out.println(" This BMW has M package.");
        }
    }
}
