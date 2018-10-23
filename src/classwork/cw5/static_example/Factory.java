package classwork.cw5.static_example;

import classwork.cw5.static_example.Car.Wheel;

import java.util.Objects;

public class Factory {
    public Factory() {
    }

    public static void main(String[] args) {
        Car car = new Car("audi");
        Objects.requireNonNull(car);
        new Wheel();
    }
}