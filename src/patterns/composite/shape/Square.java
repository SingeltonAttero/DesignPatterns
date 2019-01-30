package patterns.composite.shape;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 31.01.19
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
