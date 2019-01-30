package patterns.composite.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 31.01.19
 */
public class Composite implements Shape {

    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component){
        components.add(component);
    }

    public void removeComponent(Shape component){
        components.remove(component);
    }


    @Override
    public void draw() {
        for (Shape component: components) {
            component.draw();
        }
    }
}
