package patterns.bridge.car.make;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class Kia implements Make {
    @Override
    public void setMake() {
        System.out.println("kia");
    }
}
