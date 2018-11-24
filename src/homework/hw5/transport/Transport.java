package homework.hw5.transport;

public abstract class Transport {
    private int capacity;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport() {
        this(150, 230, 1600, "Volkswagen");
    }

    public Transport(int capacity, int maxSpeed, int weight, String brand) {
        setCapacity(capacity);
        setMaxSpeed(maxSpeed);
        setWeight(weight);
        setBrand(brand);
    }

    private double capacityToKV(int capacity) {
        return capacity * 0.74;
    }

    public void printDescription() {
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
        if (capacity <= 0) {
            throw new java.lang.IllegalArgumentException("Мощность должна быть больше 0");
        }
        this.capacity = capacity;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            throw new java.lang.IllegalArgumentException("Максимальная скорость должна быть больше 0");
        }
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            throw new java.lang.IllegalArgumentException("Вес должен быть больше 0");
        }
        this.weight = weight;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        if (brand.equals("")) {
            throw new java.lang.IllegalArgumentException("Марка введёна неверно");
        }
        this.brand = brand;
    }
}
