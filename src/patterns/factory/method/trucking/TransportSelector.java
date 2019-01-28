package patterns.factory.method.trucking;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 28.01.19
 */
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
