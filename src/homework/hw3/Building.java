package homework.hw3;

/**
 * Task2 2*
 * Создать класс Building, продумать, какое состояние и какое поведение  может быть.
 * Возможно, создать вспомогательные классы (Room etc).
 *
 * @author Gnitko Andrei
 */
public class Building {
    /**
     * Количество этажей в здании.
     */
    private int floors;
    /**
     * Количество подъездов в здании.
     */
    private int entrances;
    /**
     * Количество квартир в здании.
     */
    private int flats;
    /**
     * Наличие лифта в здании.
     */
    private boolean isElevator;

    /**
     * Конструктор задающий по умолчанию количество этажей, квартир, подъездов и наличие лифта в здании.
     */
    public Building() {
        this.floors = 5;
        this.entrances = 7;
        this.flats = 70;
        this.isElevator = false;
    }

    /**
     * Геттер для количества этажей.
     *
     * @return количество этажей
     */
    public int getFloors() {
        return floors;
    }

    /**
     * Сеттер для количества этажей.
     *
     * @param floors количество этажей
     */
    public void setFloors(int floors) {
        this.floors = floors;
    }

    /**
     * Геттер для количества подъездов.
     *
     * @return количество подъездов
     */
    public int getEntrances() {
        return entrances;
    }

    /**
     * Сеттер для количества подъездов.
     *
     * @param entrances количество подъездов
     */
    public void setEntrances(int entrances) {
        this.entrances = entrances;
    }

    /**
     * Геттер для количества квартир.
     *
     * @return количество квартир
     */
    public int getFlats() {
        return flats;
    }

    /**
     * Сеттер для количества квартир.
     *
     * @param flats количество квартир
     */
    public void setFlats(int flats) {
        this.flats = flats;
    }

    /**
     * Геттер для наличия лифта.
     *
     * @return наличие лифта
     */
    public boolean isElevator() {
        return isElevator;
    }

    /**
     * Сеттер для наличия лифта.
     *
     * @param elevator наличие лифта
     */
    public void setElevator(boolean elevator) {
        isElevator = elevator;
    }
}
