package homework.hw5.transport.air;

import homework.hw5.transport.Transport;

public abstract class AirTransport extends Transport {
    private int wingspan; //размах крыльев
    private int minRunwayLength; //минимальная длинна взлётно-посадочной полосы

    public AirTransport() {
        super(100000, 900, 300000, "Boeing");
    }

    public AirTransport(int wingspan, int minRunwayLength) {
        setWingspan(wingspan);
        setMinRunwayLength(minRunwayLength);
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Это вощдушный транспорт");
        System.out.printf("Размах крыльев %d (м)", this.wingspan);
        System.out.printf("Минимальная длинна взлётно-посадочной полосы %d (м)", this.minRunwayLength);
    }

    public int getWingspan() {
        return this.wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan <= 0) {
            throw new IllegalArgumentException("Размах крытьев должен быть больше 0");
        }
        this.wingspan = wingspan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    public void setMinRunwayLength(int minRunwayLength) {
        if (minRunwayLength <= 0) {
            throw new IllegalArgumentException("Минимальная длинна взлётной полосы должна быть больше 0");
        }
        this.minRunwayLength = minRunwayLength;
    }
}
