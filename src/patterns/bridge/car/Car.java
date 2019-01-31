package patterns.bridge.car;

import patterns.bridge.car.make.Make;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public abstract class Car {

    protected final Make make;

    public Car(Make make) {
        this.make = make;
    }

    abstract void showDetailed();
}
