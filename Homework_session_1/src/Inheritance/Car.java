package Inheritance;

public class Car extends Vehicle {

    private String manufacturer;
    private int horsePower;
    private int engineCapacity;
    private int wheelsNo;
    private int gearNo;
    private String direction;
    private float speed;

    public Car() {}

    public Car(String manufacturer,
               int horsePower,
               int engineCapacity,
               int wheelsNo,
               int gearNo,
               String direction,
               float speed) {
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
        this.wheelsNo = wheelsNo;
        this.gearNo = gearNo;
        this.direction = direction;
        this.speed = speed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getWheelsNo() {
        return wheelsNo;
    }

    public void setWheelsNo(int wheelsNo) {
        this.wheelsNo = wheelsNo;
    }

    public int getGearNo() {
        return gearNo;
    }

    public String getDirection() {
        return direction;
    }

    public float getSpeed() {
        return speed;
    }

    @Override
    public void handSteering(String direction) {
        System.out.println("Your " + this.getManufacturer() + " is moving " + direction);
        this.direction = direction;
    }

    @Override
    public void changeGear(int gearNo) {
        System.out.println("Your " + this.getManufacturer() + " is now in " +
                    gearNo + " gear.");
        this.gearNo = gearNo;
    }

    @Override
    public void movingSpeed(float speed) {
        if(speed < this.getSpeed()) {
            System.out.println("Your " + this.getManufacturer() + " is slowing down from " +
                    this.getSpeed() + " to " + speed);
        } else {
            System.out.println("Your " + this.getManufacturer() + " is accelerating from " +
                    this.getSpeed() + " to " + speed);
        }
        this.speed = speed;
    }
}
