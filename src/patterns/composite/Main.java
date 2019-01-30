package patterns.composite;

import patterns.composite.shape.Circle;
import patterns.composite.shape.Composite;
import patterns.composite.shape.Square;
import patterns.composite.shape.Triangle;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 31.01.19
 */
public class Main {

    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.addComponent(new Square());
        composite.addComponent(new Circle());
        composite.addComponent(new Square());
        composite.addComponent(new Square());
        composite.addComponent(new Circle());
        composite.addComponent(new Triangle());
        composite.addComponent(new Triangle());
        composite.addComponent(new Circle());
        composite.addComponent(new Triangle());
        composite.draw();
    }

}
