package patterns.factory.method.trucking;

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
