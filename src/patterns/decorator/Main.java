package patterns.decorator;

import patterns.decorator.components.decarators.BorderDecorator;
import patterns.decorator.components.decarators.ColorDecorator;
import patterns.decorator.components.decarators.Decorator;
import patterns.decorator.components.objects.TextView;
import patterns.decorator.components.objects.Window;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class Main {

    public static void main(String[] args) {
        Decorator borderDecorator = new BorderDecorator(new ColorDecorator(new TextView()));
        Decorator colorDecorator = new ColorDecorator(new ColorDecorator(new BorderDecorator(new Window())));
        borderDecorator.draw();
        colorDecorator.draw();
    }

}
