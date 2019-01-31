package patterns.flyweight;

import patterns.flyweight.shape.Shape;
import patterns.flyweight.shape.ShapeFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class Main {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();

        shapes.add(factory.getShape("круг"));
        shapes.add(factory.getShape("круг"));
        shapes.add(factory.getShape("квадрат"));
        shapes.add(factory.getShape("точка"));
        shapes.add(factory.getShape("круг"));
        shapes.add(factory.getShape("квадрат"));
        shapes.add(factory.getShape("точка"));
        shapes.add(factory.getShape("круг"));
        shapes.add(factory.getShape("квадрат"));
        shapes.add(factory.getShape("точка"));
        shapes.add(factory.getShape("круг"));
        shapes.add(factory.getShape("круг"));

        Random random = new Random();
        for (Shape shape:shapes){
            shape.draw(random.nextInt(100),random.nextInt(100));
        }

    }

}
