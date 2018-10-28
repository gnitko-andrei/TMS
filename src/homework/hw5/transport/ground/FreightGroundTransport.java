package homework.hw5.transport.ground;

public class FreightGroundTransport extends GroundTransport {
    private int loadCapacity;

    public FreightGroundTransport() {
        this(1000);
    }

    public FreightGroundTransport(int loadCapacity) {
        super();
        setLoadCapacity(loadCapacity);
    }

    public void printLoadMessge(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вес должен быть больше 0");
        } else if (weight <= this.getLoadCapacity()) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Это грузовой наземный транспорт");
        System.out.printf("Грузоподъёмность %d (т)\n", this.loadCapacity);
    }

    public int getLoadCapacity() {
        return this.loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        if (loadCapacity <= 0) {
            throw new IllegalArgumentException("Грузоподъёмность должна быть больше 0");
        }
        this.loadCapacity = loadCapacity;
    }
}