class Car {

    String owner;
    String brand;
    String serialNumber;
    double fuel;

    Car(String owner, String brand, String serialNumber, double fuel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuel = fuel;
    }

    void start() {
        if (fuel > 0) {
            System.out.println("Car is starting...");
        } else {
            System.out.println("Cannot start. No fuel.");
        }
    }

    void stop() {
        System.out.println("Car is stopped.");
    }

    void checkFuel() {
        System.out.println("Current fuel: " + fuel + " liters");
    }
}

public class CarSystem {
    public static void main(String[] args) {

        Car car1 = new Car("Rahim", "Toyota", "TX12345", 10.5);

        car1.start();
        car1.checkFuel();
        car1.stop();
    }
}