package patterns.singleton.simple;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 24.01.19
 *
 * Самая простая релизация шаблона singleton.
 * Нельзя использовать в многопоточной среде.
 *
 * */

public class SimpleSingleton {

    private static SimpleSingleton instance;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

    public void message() {
        System.out.println("Test to singleton");
    }

}
