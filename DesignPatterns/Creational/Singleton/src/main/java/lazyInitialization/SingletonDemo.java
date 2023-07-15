package lazyInitialization;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class SingletonDemo {
    public static void main(String[] args) throws InterruptedException {
        boolean broken=true;
        final DatabaseManager[] dbManagers = new DatabaseManager[2];

        do {
            broken=true;
            Runnable r1 = () ->
            {
                dbManagers[0] = DatabaseManager.getInstance();
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

            if(dbManagers[0]==dbManagers[1])
                broken=false;

            dbManagers[0].reset();
            dbManagers[1].reset();
            System.gc();
        } while (!broken);
        System.out.println(" DO NOT IMPLEMENT SINGLETON IN MULTITHREADED ENVIRONMENT LIKE THIS");
    }
}
