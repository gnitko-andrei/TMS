package classwork.cw5.static_example;

public class Car {
    static String ID = "";
    private String brand;
    private Car.Engine engine;

    Car(String brand) {
        this.brand = brand;
        this.engine = new Car.Engine(100);
    }

    class Engine {
        private int power;
        Engine(int power) {
            this.power = power;
        }
    }

    static class Wheel {
        Wheel() {
        }
    }
}