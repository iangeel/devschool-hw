package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Car defaultCar = new Car(1600f, "Default Car");
        Car bmwCar = new Bmw(3000f, "BMW 350f", true);
        Car opelCar = new Opel(1600f, "Opel Astra");
        Car mercedesCar = new Mercedes(2500f, "Mercedes E coupe", false, "automatic");

        defaultCar.testCar();
        bmwCar.testCar();
        opelCar.testCar();
        mercedesCar.testCar();
    }
}
