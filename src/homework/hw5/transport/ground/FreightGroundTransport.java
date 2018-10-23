package homework.hw5.transport.ground;

public class FreightGroundTransport extends GroundTransport {
    private int loadCapacity;

    public FreightGroundTransport() {
        super();
        this.loadCapacity = 10000;
    }

    public FreightGroundTransport(int loadCapacity) {
        super();
        this.loadCapacity = loadCapacity;
    }

    public void printLoadMessge(int weight) {
        if (weight <= this.getLoadCapacity()) {
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
        this.loadCapacity = loadCapacity;
    }
}