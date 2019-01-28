package patterns.singleton;

import patterns.singleton.simple.SimpleSingleton;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 24.01.19
 */
public class Main {

    public static void main(String[] args) {
        SimpleSingleton instance = SimpleSingleton.getInstance();
        instance.message();
    }

}
