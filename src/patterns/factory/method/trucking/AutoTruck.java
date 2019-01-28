package patterns.factory.method.trucking;

public class AutoTruck implements Transport {
    @Override
    public void move() {
        System.out.println("Грузови -> move: Скорость до 100 км/час");
    }

    @Override
    public void stop() {
        System.out.println("Грузови -> stop: Нажатие на педаль тормоза");
    }

    @Override
    public void freight() {
        System.out.println("Грузови -> freight: Возить любые товары по суши");
    }
}
