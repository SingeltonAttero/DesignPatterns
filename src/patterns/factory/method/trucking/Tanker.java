package patterns.factory.method.trucking;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 28.01.19
 */
public class Tanker implements Transport {

    @Override
    public void move() {
        System.out.println("Танкер -> move : Скорость до 16 узлов в час");
    }

    @Override
    public void stop() {
        System.out.println("Танкер -> stop : Встал на якорь");
    }

    @Override
    public void freight() {
        System.out.println("Танкер -> freight : Используются для перевозок тёмных нефтегрузов по воде");
    }
}
