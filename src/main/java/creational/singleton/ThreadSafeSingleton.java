package creational.singleton;

public class ThreadSafeSingleton {

    // volatile = The value of this variable will never be cached thread-locally: all reads and writes will go straight to "main memory"
    private static volatile ThreadSafeSingleton theInstance;

    private ThreadSafeSingleton() {
        // Avoid reflection !
        if (theInstance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static ThreadSafeSingleton getInstance() {       // No arguments = singleton
        if (theInstance == null) {
            synchronized (ThreadSafeSingleton.class) {       // Thread safe instance creation.
                if (theInstance == null) {
                    theInstance = new ThreadSafeSingleton();
                }
            }
        }
        return theInstance;
    }
}
