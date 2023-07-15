package lazydoublecheckedlockinginitialization;

import threadsafelazyinitialization.DatabaseManager;

public class SingletonDemo {
    public static void main(String[] args) throws InterruptedException {
        final threadsafelazyinitialization.DatabaseManager[] dbManagers = new threadsafelazyinitialization.DatabaseManager[2];

        Runnable r1 = () ->
        {
            dbManagers[0] = threadsafelazyinitialization.DatabaseManager.getInstance();
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " created " + dbManagers[0].hashCode());
        };
        Runnable r2 = () ->
        {
            dbManagers[1] = DatabaseManager.getInstance();
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " created " + dbManagers[1].hashCode());
        };


        // Instantiating two thread classes
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);

        // Running two threads for the same task
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(" This will always ensure thread safety");
    }
}
