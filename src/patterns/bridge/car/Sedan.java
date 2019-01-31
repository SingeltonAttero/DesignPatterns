package patterns.bridge.car;

import patterns.bridge.car.make.Make;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class Sedan extends Car {
    public Sedan(Make make) {
        super(make);
    }

    @Override
    public void showDetailed() {
        System.out.println("sedan");
        make.setMake();
    }
}
