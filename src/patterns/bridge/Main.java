package patterns.bridge;

import patterns.bridge.car.Hatchback;
import patterns.bridge.car.Sedan;
import patterns.bridge.car.make.Kia;
import patterns.bridge.car.make.Skoda;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class Main {

    public static void main(String[] args) {
        Hatchback hatchback = new Hatchback(new Skoda());
        hatchback.showDetailed();
        Sedan sedan = new Sedan(new Kia());
        sedan.showDetailed();
        Hatchback hatchback1Kia = new Hatchback(new Kia());
        hatchback1Kia.showDetailed();
    }
}
