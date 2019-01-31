package patterns.bridge.car;

import patterns.bridge.car.make.Make;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class Hatchback extends Car {

    public Hatchback(Make make) {
        super(make);
    }

    @Override
    public void showDetailed() {
        System.out.println("hatchback");
        make.setMake();
    }
}
