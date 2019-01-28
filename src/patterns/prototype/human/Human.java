package patterns.prototype.human;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 28.01.19
 */
public class Human implements Duplicate {

    private final String name;
    private final int age;

    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public Human copy() {
        return new Human(name,age);
    }
}
