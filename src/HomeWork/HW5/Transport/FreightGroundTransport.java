package HomeWork.HW5.Transport;

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

    public void canLoad(int weight) {
        if (weight <= this.getLoadCapacity()) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }

    }

    public void description() {
        super.description();
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