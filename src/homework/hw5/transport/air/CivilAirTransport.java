package homework.hw5.transport.air;

/**
 * Класс пассажирского воздушного транспорта.
 *
 * @author Gnitko Andrei
 * @see AirTransport
 */
public class CivilAirTransport extends AirTransport {
    /**
     * Максимальное количество пассажиров.
     */
    private int passengersMaxNumber;
    /**
     * Наличие бизнес класса (true/false)
     */
    private boolean isBusinessClass;

    /**
     * Конструктор по умолчанию, задающий стандартные значения максимального количества пассажиров
     * и наличия бизнес класса (true/false) воздушного пассажирского транспорта.
     */
    public CivilAirTransport() {
        this(100, true);
    }

    /**
     * Конструктор, задающий значения
     * и наличия бизнес класса (true/false) воздушного пассажирского транспорта.
     *
     * @param passengersMaxNumber максимальное количество пассажиров
     * @param isBusinessClass     наличие бизнес класса (true/false)
     */
    public CivilAirTransport(int passengersMaxNumber, boolean isBusinessClass) {
        setPassengersMaxNumber(passengersMaxNumber);
        setBusinessClass(isBusinessClass);
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Это гражданский воздушный транспорт");
        System.out.println("Максимальное количество пассажиров " + passengersMaxNumber);
        if (this.isBusinessClass) {
            System.out.println("Бизнес-класс есть");
        } else {
            System.out.println("Бизнес-класс отсутствует");
        }
    }

    /**
     * Метод, проверяющий возмоность посадки в самолёт заданного количества пассажиров и выводящий соответствующее сообщение.
     *
     * @param passengersNumber количество пассажиров
     */
    public void printLoadMessage(int passengersNumber) {
        if (passengersNumber < 0) {
            throw new IllegalArgumentException("Число пассажиров не может быть отрицательным");
        }
        if (passengersNumber == 0) {
            System.out.println("Самолёт пустым не полетит");
        } else if (passengersNumber <= this.getPassengersMaxNumber()) {
            System.out.println("Посадка пассажиров проведена успешно");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }

    }

    /**
     * Геттер максимального количества пассажиров.
     *
     * @return максимальное количество пассажиров
     */
    public int getPassengersMaxNumber() {
        return this.passengersMaxNumber;
    }

    /**
     * Сеттер максимального количества пассажиров.
     *
     * @param passengersMaxNumber максимальное количество пассажиров
     */
    public void setPassengersMaxNumber(int passengersMaxNumber) {
        if (passengersMaxNumber <= 0) {
            throw new IllegalArgumentException("Максимальное исло пассажиров должно быть больше 0");
        }
        this.passengersMaxNumber = passengersMaxNumber;
    }

    /**
     * Геттер наличия бизнес класса (true/false)
     *
     * @return наличие бизнес класса (true/false)
     */
    public boolean isBusinessClass() {
        return this.isBusinessClass;
    }

    /**
     * Сеттер наличия бизнес класса (true/false)
     *
     * @param businessClass наличие бизнес класса (true/false)
     */
    public void setBusinessClass(boolean businessClass) {
        this.isBusinessClass = businessClass;
    }
}
