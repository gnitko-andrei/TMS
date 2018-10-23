package homework.hw5.transport.air;

import homework.hw5.transport.Transport;

public class AirTransport extends Transport {
    private int wingspan; //размах крыльев
    private int minRunwayLength; //минимальная длинна взлётно-посадочной полосы

    public AirTransport() {
        super(100000, 900, 300000, "Boeing");
        this.wingspan = 30;
        this.minRunwayLength = 4000;
    }

    public AirTransport(int wingspan, int minRunwayLength) {
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
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
        this.wingspan = wingspan;
    }
}
