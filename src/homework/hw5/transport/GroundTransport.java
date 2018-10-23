package homework.hw5.transport;

public class GroundTransport extends Transport {
    private int wheelsNumber;
    private int fuelConsumption;

    public GroundTransport() {
        super();
        this.wheelsNumber = 4;
        this.fuelConsumption = 8;
    }

    public GroundTransport(int wheelsNumber, int fuelConsumption) {
        super();
        this.wheelsNumber = wheelsNumber;
        this.fuelConsumption = fuelConsumption;
    }

    public void description() {
        super.description();
        System.out.println("Это наземный транспорт");
        System.out.println("Количество колёс " + wheelsNumber);
        System.out.printf("Расход топлива %d (л/100км)\n", fuelConsumption);
    }

    public int getWheelsNumber() {
        return this.wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public int getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
