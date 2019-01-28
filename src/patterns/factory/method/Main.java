package patterns.factory.method;

import patterns.factory.method.trucking.Transport;
import patterns.factory.method.trucking.TransportSelector;
import patterns.factory.method.trucking.TransportationType;

public class Main {


    public static void main(String[] args) {
        // TODO TEST MODULE
    }


    /*
     * test module transport
     * */
    private static void testTransportModule() {
        TransportSelector instance = TransportSelector.getInstance();

        System.out.println("Выбран самолет");
        Transport airplane = instance.getTransport(TransportationType.AIR);
        airplane.move();
        airplane.stop();
        airplane.freight();
        System.out.println("Самолет выполнил все задания");

        System.out.println("Выбран грузовик");
        Transport autoTruck = instance.getTransport(TransportationType.EARTH);
        autoTruck.move();
        autoTruck.stop();
        autoTruck.freight();
        System.out.println("грузовик выполнил все задания");

        System.out.println("Выбран танкер");
        Transport tanker = instance.getTransport(TransportationType.WATER);
        tanker.move();
        tanker.stop();
        tanker.freight();
        System.out.println("танкер выполнил все задания");


    }

}
