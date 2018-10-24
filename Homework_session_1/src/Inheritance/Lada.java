package Inheritance;

public class Lada extends Car {

    private String model;
    private String origin;

    public Lada(String manufacturer,
                int horsePower,
                int engineCapacity,
                int wheelsNo,
                int gearNo,
                String direction,
                float speed,
                String model,
                String origin) {
        super(manufacturer, horsePower, engineCapacity, wheelsNo, gearNo, direction, speed);
        this.model = model;
        this.origin = origin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }



    @Override
    public void handSteering(String direction) {
        super.handSteering(direction);
    }

    @Override
    public void changeGear(int gearNo) {
        super.changeGear(gearNo);
    }

    @Override
    public void movingSpeed(float speed) {
        super.movingSpeed(speed);
    }
}
