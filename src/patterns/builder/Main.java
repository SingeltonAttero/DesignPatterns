package patterns.builder;

import patterns.builder.car.Car;
import patterns.builder.car.Transmission;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 29.01.19
 */
public class Main {
    public static void main(String[] args) {
        Car lambargini = new Car.Builder()
                .makeCar("Lambargini")
                .maxSpeed(320)
                .transmission(Transmission.AUTO)
                .build();

        System.out.println(lambargini);
    }
}
