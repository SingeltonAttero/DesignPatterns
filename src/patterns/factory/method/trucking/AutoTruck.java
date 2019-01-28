package patterns.factory.method.trucking;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 28.01.19
 */
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
