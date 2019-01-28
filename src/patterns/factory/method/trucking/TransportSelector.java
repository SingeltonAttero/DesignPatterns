package patterns.factory.method.trucking;

public class TransportSelector {

    private TransportSelector() {
    }

    private static TransportSelector instance;

    public static TransportSelector getInstance() {
        if (instance == null) {
            instance = new TransportSelector();
        }
        return instance;
    }


    public Transport getTransport(TransportationType type) {
        Transport transport = null;
        switch (type) {
            case AIR:
                transport = new Airplane();
                break;
            case EARTH:
                transport = new AutoTruck();
                break;
            case WATER:
                transport = new Tanker();
                break;
        }
        return transport;
    }

}
