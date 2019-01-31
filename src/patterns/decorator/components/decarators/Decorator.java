package patterns.decorator.components.decarators;

import patterns.decorator.components.objects.Component;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void afterDraw();

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
}
