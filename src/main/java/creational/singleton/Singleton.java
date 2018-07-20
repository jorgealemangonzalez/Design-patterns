package creational.singleton;

public class Singleton {
    private static Singleton theInstance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return theInstance;
    }
}
