package homework.hw5.transport.ground;

import homework.hw5.transport.Transport;

/**
 * Абстрактный класс наземного транспорта.
 *
 * @author Gnitko Andrei
 * @see Transport
 */
public abstract class GroundTransport extends Transport {
    /**
     * Количество колёс.
     */
    private int wheelsNumber;
    /**
     * Расход топлива(л/100км).
     */
    private int fuelConsumption;

    /**
     * Конструктор по умолчанию, задающий стандартные значения количества колёс и расхода топлива наземного транспорта.
     */
    public GroundTransport() {
        this(4, 8);
    }

    /**
     * Конструктор, задающий значения количества колёс и расхода топлива наземного транспорта.
     *
     * @param wheelsNumber    количество колёс
     * @param fuelConsumption расход топлива(л/100км)
     */
    public GroundTransport(int wheelsNumber, int fuelConsumption) {
        super();
        setWheelsNumber(wheelsNumber);
        setFuelConsumption(fuelConsumption);
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Это наземный транспорт");
        System.out.println("Количество колёс " + wheelsNumber);
        System.out.printf("Расход топлива %d (л/100км)\n", fuelConsumption);
    }

    /**
     * Геттер количества колёс.
     *
     * @return количество колёс
     */
    public int getWheelsNumber() {
        return this.wheelsNumber;
    }

    /**
     * Сеттер количества колёс.
     *
     * @param wheelsNumber количество колёс
     */
    public void setWheelsNumber(int wheelsNumber) {
        if (wheelsNumber < 4) {
            throw new IllegalArgumentException("Количество колёс должно быть не менее 4");
        } else if (wheelsNumber % 2 != 0) {
            throw new IllegalArgumentException("Количество колёс должно быть чётным");
        }
        this.wheelsNumber = wheelsNumber;
    }

    /**
     * Геттер расхода топлива(л/100км).
     *
     * @return расход топлива(л/100км)
     */
    public int getFuelConsumption() {
        return this.fuelConsumption;
    }

    /**
     * Сеттер расхода топлива(л/100км).
     *
     * @param fuelConsumption расход топлива(л/100км)
     */
    public void setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption <= 0) {
            throw new IllegalArgumentException("Расход топлива должен быть больше 0");
        }
        this.fuelConsumption = fuelConsumption;
    }
}
