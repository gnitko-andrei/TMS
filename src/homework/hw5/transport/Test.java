package homework.hw5.transport;

import homework.hw5.transport.air.MilitaryAirTransport;

public class Test {
    public static void main(String[] args) {
        Transport transport = new MilitaryAirTransport();
        ((MilitaryAirTransport) transport).setMissilesNumber(-5);
    }
}
