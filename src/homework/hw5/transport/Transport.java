package homework.hw5.transport;

/**
 * Абстрактный класс транспорт.
 *
 * @author Gnitko Andrei
 */
public abstract class Transport {
    /**
     * Мощность(в лошадиных силах).
     */
    private int capacity;
    /**
     * Максимальная скорость(км/ч).
     */
    private int maxSpeed;
    /**
     * Масса (кг).
     */
    private int weight;
    /**
     * Марка( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. ).
     */
    private String brand;

    /**
     * Конструктор по умолчанию, задающий стандартные значения мощности, максимальной скорости, массы и марки транспорта.
     */
    public Transport() {
        this(150, 230, 1600, "Volkswagen");
    }

    /**
     * Конструктор, задающий значения мощности, максимальной скорости, массы и марки транспорта.
     *
     * @param capacity Мощность(в лошадиных силах)
     * @param maxSpeed Максимальная скорость(км/ч)
     * @param weight   Масса (кг)
     * @param brand    Марка( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. )
     */
    public Transport(int capacity, int maxSpeed, int weight, String brand) {
        setCapacity(capacity);
        setMaxSpeed(maxSpeed);
        setWeight(weight);
        setBrand(brand);
    }

    /**
     * Метод для перевода мощности в лошадиных силах в мощность в киловаттах (кВ)
     *
     * @param capacity мощность в л.с.
     * @return мощность в кВ
     */
    private double capacityToKV(int capacity) {
        return capacity * 0.74;
    }

    /**
     * Метод описание, возвращает составленную строку
     * с описанием всех характеристик объекта и мощность в киловаттах (кВ)
     */
    public void printDescription() {
        System.out.println("Мощность(в лошадиных силах) " + capacity);
        System.out.printf("Мощность %f (кВт)\n", capacityToKV(capacity));
        System.out.printf("Максимальная скорость %d (км/ч)\n", maxSpeed);
        System.out.printf("Масса %d (кг)\n", weight);
        System.out.println("Марка " + brand);
    }

    /**
     * Геттер мощности(в лошадиных силах).
     *
     * @return мощность(в лошадиных силах)
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Сеттер мощности(в лошадиных силах).
     *
     * @param capacity мощность(в лошадиных силах)
     */
    public void setCapacity(int capacity) {
        if (capacity <= 0) {
            throw new java.lang.IllegalArgumentException("Мощность должна быть больше 0");
        }
        this.capacity = capacity;
    }

    /**
     * Геттер максимальной скорости(км/ч).
     *
     * @return аксимальная скорость(км/ч)
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Сеттер максимальной скорости(км/ч).
     *
     * @param maxSpeed максимальная скорость(км/ч)
     */
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            throw new java.lang.IllegalArgumentException("Максимальная скорость должна быть больше 0");
        }
        this.maxSpeed = maxSpeed;
    }

    /**
     * Геттер массы (кг)
     *
     * @return масса (кг)
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Сеттер массы (кг)
     *
     * @param weight масса (кг)
     */
    public void setWeight(int weight) {
        if (weight <= 0) {
            throw new java.lang.IllegalArgumentException("Вес должен быть больше 0");
        }
        this.weight = weight;
    }

    /**
     * Геттер марки( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. ).
     *
     * @return марка(например : Audi, BMW, Boing, Airbus, Scania, МАЗ и т.д.).
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Сеттер марки( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. ).
     *
     * @param brand марка( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. ).
     */
    public void setBrand(String brand) {
        if (brand.equals("")) {
            throw new java.lang.IllegalArgumentException("Марка введёна неверно");
        }
        this.brand = brand;
    }
}
