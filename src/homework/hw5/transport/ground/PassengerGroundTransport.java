package homework.hw5.transport.ground;

/**
 * Класс пассажирского наземного транспорта.
 *
 * @author Gnitko Andrei
 * @see GroundTransport
 */
public class PassengerGroundTransport extends GroundTransport {
    /**
     * Тип кузова.
     */
    private String bodyType;
    /**
     * Количество пассажиров.
     */
    private int passengersNumber;

    /**
     * Конструктор по умолчанию, задающий стандартные значения типа кузова и количества пассажиров
     * наземного пассажирского транспорта.
     */
    public PassengerGroundTransport() {
        this("Sedan", 4);
    }

    /**
     * Конструктор, задающий значения типа кузова и количества пассажиров
     * наземного пассажирского транспорта.
     *
     * @param bodyType         тип кузова
     * @param passengersNumber количество пассажиров
     */
    public PassengerGroundTransport(String bodyType, int passengersNumber) {
        super();
        setBodyType(bodyType);
        setPassengersNumber(passengersNumber);
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Это пассажирский наземный транспорт");
        System.out.println("Тип кузова " + this.bodyType);
        System.out.println("Количество пассажиров " + this.passengersNumber);
    }

    /**
     * Метод который считает сколько километров проедет машина двигаясь с максимальной скоростью и
     * сколько топлива она израсходует за заданное
     *
     * @param time время движения
     */
    public void goSomeTime(int time) {
        if (time <= 0) {
            throw new IllegalArgumentException("время должно быть больше 0");
        }
        int distance = time * this.getMaxSpeed();
        double consumptedFuel = this.consumptFuel(distance);
        String brand = this.getBrand();
        System.out.printf("За время %d ч, автомобиль %s, двигаясь с максимальной скоростью %d км/ч, проедет %d км. и израсходует %f л. топлива", time, brand, this.getMaxSpeed(), distance, consumptedFuel);
    }

    /**
     * Метод лля расчёта расхода топлива за пройденное расстояние
     *
     * @param distance пройденное расстояние
     * @return количество потраченного топлива
     */
    private double consumptFuel(int distance) {
        return (double) (this.getFuelConsumption() * distance / 100);
    }

    /**
     * Геттер типа кузова.
     *
     * @return тип кузова
     */
    public String getBodyType() {
        return this.bodyType;
    }

    /**
     * Сеттер типа кузова.
     *
     * @param bodyType тип кузова
     */
    public void setBodyType(String bodyType) {
        if (bodyType.equals("")) {
            throw new IllegalArgumentException("Тип кузова введён неверно");
        }
        this.bodyType = bodyType;
    }

    /**
     * Геттер количества пассажиров.
     *
     * @return количество пассажиров
     */
    public int getPassengersNumber() {
        return this.passengersNumber;
    }

    /**
     * Сеттер количества пассажиров.
     *
     * @param passengersNumber количество пассажиров
     */
    public void setPassengersNumber(int passengersNumber) {
        if (passengersNumber < 0) {
            throw new IllegalArgumentException("Количество пассажиров не может быть отрицательным");
        }
        this.passengersNumber = passengersNumber;
    }
}
