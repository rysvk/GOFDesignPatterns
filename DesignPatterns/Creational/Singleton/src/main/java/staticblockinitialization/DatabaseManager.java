package staticblockinitialization;

/**
 * Static block initialization implementation is similar to eager initialization,
 * except that instance of the class is created in the static block that provides the option for exception handling.
 *
 * Both eager initialization and static block initialization create the instance even
 * before it’s being used and that is not the best practice to use.
 *
 */

public class DatabaseManager {
    private static DatabaseManager instance;

    private DatabaseManager(){}

    // static block initialization for exception handling
    static {
        try {
            instance = new DatabaseManager();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static DatabaseManager getInstance() {
        return instance;
    }
}