package patterns.adapter;

import patterns.adapter.graphics.VectorFromRasterAdapterComposition;
import patterns.adapter.graphics.VectorFromRasterAdapterInheritance;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 30.01.19
 */
public class Main {
    public static void main(String[] args) {
        VectorFromRasterAdapterInheritance inheritance = new VectorFromRasterAdapterInheritance();
        VectorFromRasterAdapterComposition composition = new VectorFromRasterAdapterComposition();
        System.out.println("inheritance");
        inheritance.drawLine();
        inheritance.drawSquare();
        System.out.println("composition");
        composition.drawLine();
        composition.drawSquare();

    }
}
