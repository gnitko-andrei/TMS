package homework.hw5.transport;

public class Transport {
    private int capacity;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport() {
        this.capacity = 150;
        this.maxSpeed = 230;
        this.weight = 1600;
        this.brand = "Volkswagen";
    }

    public Transport(int capacity, int maxSpeed, int weight, String brand) {
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    private double capacityToKV(int capacity) {
        return capacity * 0.74;
    }

    public void description() {
        System.out.println("Мощность(в лошадиных силах) " + capacity);
        System.out.printf("Мощность %f (кВт)\n", capacityToKV(capacity));
        System.out.printf("Максимальная скорость %d (км/ч)\n", maxSpeed);
        System.out.printf("Масса %d (кг)\n", weight);
        System.out.println("Марка " + brand);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
