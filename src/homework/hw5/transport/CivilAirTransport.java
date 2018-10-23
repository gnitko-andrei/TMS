package homework.hw5.transport;

public class CivilAirTransport extends AirTransport {
    private int passengersMaxNumber;
    private boolean isBusinessClass;

    public CivilAirTransport() {
        this.passengersMaxNumber = 150;
        this.isBusinessClass = true;
    }

    public CivilAirTransport(int passengersMaxNumber, boolean isBusinessClass) {
        this.passengersMaxNumber = passengersMaxNumber;
        this.isBusinessClass = isBusinessClass;
    }

    public void description() {
        super.description();
        System.out.println("Это гражданский воздушный транспорт");
        System.out.println("Максимальное количество пассажиров " + passengersMaxNumber);
        if (this.isBusinessClass) {
            System.out.println("Бизнес-класс есть");
        } else {
            System.out.println("Бизнес-класс отсутствует");
        }
    }

    public void canLoad(int passengersNumber) {
        if (passengersNumber <= this.getPassengersMaxNumber()) {
            System.out.println("Посадка пассажиров проведена успешно");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }

    }

    public int getPassengersMaxNumber() {
        return this.passengersMaxNumber;
    }

    public void setPassengersMaxNumber(int passengersMaxNumber) {
        this.passengersMaxNumber = passengersMaxNumber;
    }

    public boolean isBusinessClass() {
        return this.isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.isBusinessClass = businessClass;
    }
}
