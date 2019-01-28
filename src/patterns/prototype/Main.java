package patterns.prototype;

import patterns.prototype.human.Human;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 28.01.19
 */
public class Main {

    public static void main(String[] args) {

        Human original = new Human("Yakow", 28);
        System.out.println(original);

        Human clone = original.copy();
        System.out.println(clone);


    }

}
