package homework.hw5.transport.ground;

public class PassengerGroundTransport extends GroundTransport {
    private String bodyType;
    private int passengersNumber;

    public PassengerGroundTransport() {
        this("Sedan", 4);
    }

    public PassengerGroundTransport(String bodyType, int passengersNumber) {
        super();
        setBodyType(bodyType);
        setPassengersNumber(passengersNumber);
    }


    public void printDescription() {
        super.printDescription();
        System.out.println("Это пассажирский наземный транспорт");
        System.out.println("Тип кузова " + this.bodyType);
        System.out.println("Количество пассажиров " + this.passengersNumber);
    }

    public void goSomeTime(int time) {
        if(time <= 0) {
            throw new IllegalArgumentException("время должно быть больше 0");
        }
        int distance = time * this.getMaxSpeed();
        double consumptedFuel = this.consumptFuel(distance);
        String brand = this.getBrand();
        System.out.printf("За время %d ч, автомобиль %s, двигаясь с максимальной скоростью %d км/ч, проедет %d км. и израсходует %f л. топлива", time, brand, this.getMaxSpeed(), distance, consumptedFuel);
    }

    private double consumptFuel(int distance) {
        return (double)(this.getFuelConsumption() * distance / 100);
    }

    public String getBodyType() {
        return this.bodyType;
    }

    public void setBodyType(String bodyType) {
        if(bodyType.equals("")) {
            throw new IllegalArgumentException("Тип кузова введён неверно");
        }
        this.bodyType = bodyType;
    }

    public int getPassengersNumber() {
        return this.passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        if (passengersNumber < 0) {
            throw new IllegalArgumentException("Количество пассажиров не может быть отрицательным");
        }
        this.passengersNumber = passengersNumber;
    }
}
