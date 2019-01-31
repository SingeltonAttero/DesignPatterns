package patterns.flyweight.shape;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class Circle implements Shape {

    private final int r = 8;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + " . " + y + ") :рисуем круг с радиусом " + r);
    }

}
