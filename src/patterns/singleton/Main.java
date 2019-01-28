package patterns.singleton;

public class Main {

    public static void main(String[] args) {
        SimpleSingleton instance = SimpleSingleton.getInstance();
        instance.message();
    }

}
