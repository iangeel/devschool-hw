package Polymorphism;

public class Mercedes extends Car {

    private boolean hasAmgPackage;
    private String transmisionType;

    public Mercedes(float cylidres, String name, boolean hasAmgPackage, String transmisionType) {
        super(cylidres, name);
        this.hasAmgPackage = hasAmgPackage;
        this.transmisionType = transmisionType;
    }

    @Override
    public String getName() {
        System.out.println("Getter for Mercedes name");
        return this.name;
    }

    @Override
    public boolean isEnginge() {
        System.out.println("Getter for Mercedes engine");
        return this.enginge;
    }

    @Override
    public float getCylidres() {
        System.out.println("Getter for Mercedes cylinders");
        return this.cylidres;
    }

    @Override
    public int getWheels() {
        System.out.println("Getter for Mercedes wheels");
        return this.wheels;
    }

    public String getTransmisionType() {
        return this.transmisionType;
    }

    @Override
    public void testCar() {
        super.testCar();
        System.out.print(" " + this.name + " has " + this.getTransmisionType() + " transmision.");
        if(this.hasAmgPackage) {
            System.out.println(" This Mercedes has AMG package included.");
        } else {
            System.out.println(" This Mercedes has no AMG package included.");
        }
    }
}
