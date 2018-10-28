package homework.hw5.transport.air;

import homework.hw5.transport.air.AirTransport;

public class CivilAirTransport extends AirTransport {
    private int passengersMaxNumber;
    private boolean isBusinessClass;

    public CivilAirTransport() {
        this(100, true);
    }

    public CivilAirTransport(int passengersMaxNumber, boolean isBusinessClass) {
        setPassengersMaxNumber(passengersMaxNumber);
        setBusinessClass(isBusinessClass);
    }

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

    public void printLoadMessage(int passengersNumber) {
        if(passengersNumber < 0) {
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

    public int getPassengersMaxNumber() {
        return this.passengersMaxNumber;
    }

    public void setPassengersMaxNumber(int passengersMaxNumber) {
        if(passengersMaxNumber <= 0) {
            throw new IllegalArgumentException("Максимальное исло пассажиров должно быть больше 0");
        }
        this.passengersMaxNumber = passengersMaxNumber;
    }

    public boolean isBusinessClass() {
        return this.isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.isBusinessClass = businessClass;
    }
}
