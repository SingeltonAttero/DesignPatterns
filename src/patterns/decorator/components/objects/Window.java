package patterns.decorator.components.objects;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class Window implements Component {
    @Override
    public void draw() {
        System.out.println("draw window");
    }
}
