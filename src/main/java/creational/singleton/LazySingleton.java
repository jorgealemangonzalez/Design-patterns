package creational.singleton;

public class LazySingleton {
    private static LazySingleton theInstance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (theInstance == null) {
            theInstance = new LazySingleton();
        }
        return theInstance;
    }
}
