package patterns.flyweight.shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String nameShape) {
        Shape shape = shapes.get(nameShape);
        if (shape == null) {
            switch (nameShape) {
                case "круг":
                    shape = new Circle();
                    break;
                case "точка":
                    shape = new Point();
                    break;
                case "квадрат":
                    shape = new Square();
                    break;
            }
            shapes.put(nameShape, shape);
        }
        return shape;
    }

}
