package eagerinitialization;

/**
 * In eager initialization, the instance of the singleton class is created at the time of class loading.
 * The drawback to eager initialization is that the instance is created even though the client application
 * might not be using it.
 *
 * If your singleton class is not using a lot of resources, this is the approach to use.
 * But in most of the scenarios, singleton classes are created for resources such as
 * File System, Database connections, etc.
 *
 * We should avoid the instantiation unless the client calls the getInstance method.
 * Also, this method doesn’t provide any options for exception handling.
 */

public class DatabaseManager {
    private static final DatabaseManager instance = new DatabaseManager();

    // private constructor to avoid client applications using the constructor
    private DatabaseManager(){}

    public static DatabaseManager getInstance() {
        return instance;
    }
}