package eagerinitialization;

public class SingletonDemo {
    public static void main(String[] args){

        // DatabaseManager newDbManager = new DatabaseManager(); NOT ALLOWED
        DatabaseManager dbManager = DatabaseManager.getInstance();
        DatabaseManager dbManager2 = DatabaseManager.getInstance();

        System.out.println(dbManager.hashCode());
        System.out.println(dbManager2.hashCode());

        // Different objects can have same value of hashcode
        System.out.println(dbManager==dbManager2);
    }
}
