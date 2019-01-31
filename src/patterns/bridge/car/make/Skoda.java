package patterns.bridge.car.make;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class Skoda implements Make {
    @Override
    public void setMake() {
        System.out.println("skoda");
    }
}
