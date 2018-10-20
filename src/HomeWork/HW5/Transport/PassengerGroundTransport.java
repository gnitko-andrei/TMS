package HomeWork.HW5.Transport;

public class PassengerGroundTransport extends GroundTransport {
    private String bodyType;
    private int passengersNumber;

    public PassengerGroundTransport() {
        super();
        this.bodyType = "Sedan";
        this.passengersNumber = 4;
    }

    public PassengerGroundTransport(String bodyType, int passengersNumber) {
        super();
        this.bodyType = bodyType;
        this.passengersNumber = passengersNumber;
    }


    public void description() {
        super.description();
        System.out.println("Это пассажирский наземный транспорт");
        System.out.println("Тип кузова " + this.bodyType);
        System.out.println("Количество пассажиров " + this.passengersNumber);
    }

    public void goSomeTime(int time) {
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
        this.bodyType = bodyType;
    }

    public int getPassengersNumber() {
        return this.passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
}
