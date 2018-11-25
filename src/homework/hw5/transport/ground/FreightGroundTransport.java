package homework.hw5.transport.ground;

/**
 * Класс грузового наземного транспорта.
 *
 * @author Gnitko Andrei
 * @see GroundTransport
 */
public class FreightGroundTransport extends GroundTransport {

    /**
     * Грузоподъёмность(т).
     */
    private int loadCapacity;

    /**
     * Конструктор по умолчанию, задающий стандартное значение грузоподъёмности (т) наземного грузового транспорта.
     */
    public FreightGroundTransport() {
        this(1000);
    }

    /**
     * Конструктор, задающий значение грузоподъёмности (т) наземного грузового транспорта.
     *
     * @param loadCapacity грузоподъёмность(т)
     */
    public FreightGroundTransport(int loadCapacity) {
        super();
        setLoadCapacity(loadCapacity);
    }

    /**
     * Метод, проверяющий возмоность загрузки в грузовик заданного количества груза и выводящий соответствующее сообщение.
     *
     * @param weight масса груза
     */
    public void printLoadMessge(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вес должен быть больше 0");
        } else if (weight <= this.getLoadCapacity()) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Это грузовой наземный транспорт");
        System.out.printf("Грузоподъёмность %d (т)\n", this.loadCapacity);
    }

    /**
     * Геттер для грузоподъёмности(т).
     *
     * @return грузоподъёмность(т)
     */
    public int getLoadCapacity() {
        return this.loadCapacity;
    }

    /**
     * Сеттер для грузоподъёмности(т).
     *
     * @param loadCapacity грузоподъёмность(т)
     */
    public void setLoadCapacity(int loadCapacity) {
        if (loadCapacity <= 0) {
            throw new IllegalArgumentException("Грузоподъёмность должна быть больше 0");
        }
        this.loadCapacity = loadCapacity;
    }
}