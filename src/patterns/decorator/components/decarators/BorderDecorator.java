package patterns.decorator.components.decarators;

import patterns.decorator.components.objects.Component;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class BorderDecorator extends Decorator {


    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... add border");
    }
}
