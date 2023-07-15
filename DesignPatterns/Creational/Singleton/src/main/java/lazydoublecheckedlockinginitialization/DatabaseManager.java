package lazydoublecheckedlockinginitialization;

/**
 * In this approach, the synchronized block is used inside the if condition with an additional check
 * to ensure that only one instance of a singleton class is created.
 *
 * The following code snippet provides the double-checked locking implementation:
 *
 */

public class DatabaseManager {
    private static DatabaseManager instance;

    private DatabaseManager() {
    }

    public static synchronized DatabaseManager getInstance() {
        if (instance == null) {
            // Outer null check can allow 2 threads. Once instance is created this prevents access to synchronized block.
            synchronized (DatabaseManager.class) {
                /** Only 1 thread can enter synchronized block.
                 * since synchronized is not at method level, not all threads suffer performance wise.
                 * The inner check is to perform check for any initial thread which might have entered the outer check
                 * but did not reach inside the inner check firrst.
                 */
                if (instance == null) {
                    instance = new DatabaseManager();
                }
            }
        }
        return instance;
    }
}
