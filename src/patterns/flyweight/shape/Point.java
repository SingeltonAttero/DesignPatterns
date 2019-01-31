package patterns.flyweight.shape;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + " . " + y + ") :рисуем точку");
    }
}
