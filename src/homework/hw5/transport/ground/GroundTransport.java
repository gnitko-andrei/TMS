package homework.hw5.transport.ground;

import homework.hw5.transport.Transport;

public abstract class GroundTransport extends Transport {
    private int wheelsNumber;
    private int fuelConsumption;

    public GroundTransport() {
        this(4, 8);
    }

    public GroundTransport(int wheelsNumber, int fuelConsumption) {
        super();
        setWheelsNumber(wheelsNumber);
        setFuelConsumption(fuelConsumption);
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Это наземный транспорт");
        System.out.println("Количество колёс " + wheelsNumber);
        System.out.printf("Расход топлива %d (л/100км)\n", fuelConsumption);
    }

    public int getWheelsNumber() {
        return this.wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        if (wheelsNumber < 4) {
            throw new IllegalArgumentException("Количество колёс должно быть не менее 4");
        } else if (wheelsNumber % 2 != 0) {
            throw new IllegalArgumentException("Количество колёс должно быть чётным");
        }
        this.wheelsNumber = wheelsNumber;
    }

    public int getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption <= 0) {
            throw new IllegalArgumentException("Расход топлива должен быть больше 0");
        }
        this.fuelConsumption = fuelConsumption;
    }
}
