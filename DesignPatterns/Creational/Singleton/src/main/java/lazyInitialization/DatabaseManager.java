package lazyInitialization;

/**
 * Lazy initialization method to implement the singleton pattern creates the instance in the global access method.
 *
 * This implementation works fine in the case of the single-threaded environment,
 * but when it comes to multi-threaded systems, it can cause issues if multiple threads are inside
 * the if condition at the same time.
 *
 * It will destroy the singleton pattern and both threads will get different instances of the singleton class.
 *
 */

public class DatabaseManager {
    private static DatabaseManager instance;

    private DatabaseManager(){}

    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    public void reset(){
        instance = null;
    }
}