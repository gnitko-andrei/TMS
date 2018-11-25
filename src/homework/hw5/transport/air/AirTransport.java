package homework.hw5.transport.air;

import homework.hw5.transport.Transport;

/**
 * Абстрактный класс воздушного транспорта.
 *
 * @author Gnitko Andrei
 * @see Transport
 */
public abstract class AirTransport extends Transport {
    /**
     * Размах крыльев (м).
     */
    private int wingspan;
    /**
     * Минимальная длина взлётно-посадочной полосы для взлёта.
     */
    private int minRunwayLength;

    /**
     * Конструктор по умолчанию, задающий стандартные значения размаха крыльев (м)
     * и минимальной длины взлётно-посадочной полосы для взлёта воздушного транспорта.
     */
    public AirTransport() {
        super(100000, 900, 300000, "Boeing");
    }

    /**
     * Конструктор, задающий значения размаха крыльев (м) и минимальной длины
     * взлётно-посадочной полосы для взлёта воздушного транспорта.
     *
     * @param wingspan        размах крыльев (м)
     * @param minRunwayLength минимальная длина взлётно-посадочной полосы для взлёта
     */
    public AirTransport(int wingspan, int minRunwayLength) {
        setWingspan(wingspan);
        setMinRunwayLength(minRunwayLength);
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Это вощдушный транспорт");
        System.out.printf("Размах крыльев %d (м)", this.wingspan);
        System.out.printf("Минимальная длинна взлётно-посадочной полосы %d (м)", this.minRunwayLength);
    }

    /**
     * Геттер размаха крыльев (м).
     *
     * @return размах крыльев (м)
     */
    public int getWingspan() {
        return this.wingspan;
    }

    /**
     * Сеттер размаха крыльев (м).
     *
     * @param wingspan размах крыльев (м)
     */
    public void setWingspan(int wingspan) {
        if (wingspan <= 0) {
            throw new IllegalArgumentException("Размах крытьев должен быть больше 0");
        }
        this.wingspan = wingspan;
    }

    /**
     * Геттер минимальной длины взлётно-посадочной полосы для взлёта.
     *
     * @return минимальная длина взлётно-посадочной полосы для взлёта
     */
    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    /**
     * Сеттер минимальной длины взлётно-посадочной полосы для взлёта
     *
     * @param minRunwayLength минимальная длина взлётно-посадочной полосы для взлёта
     */
    public void setMinRunwayLength(int minRunwayLength) {
        if (minRunwayLength <= 0) {
            throw new IllegalArgumentException("Минимальная длинна взлётной полосы должна быть больше 0");
        }
        this.minRunwayLength = minRunwayLength;
    }
}
