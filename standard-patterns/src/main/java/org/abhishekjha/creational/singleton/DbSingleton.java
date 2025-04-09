package org.abhishekjha.creational.singleton;

public class DbSingleton {
    // volatile keyword ensures that changes in a variable are immediately propagated to all other
    // threads. Values are directly read from and written to the main memory.
    private static volatile DbSingleton instance = null;

    // private constructor to prevent instantiation
    private DbSingleton() {
        // This will ensure that multiple instances of this class is not created
        // even through Refection (using getClass().getMethod().setAccessible(true))
        if (instance != null) {
            throw new RuntimeException("Use getInstance method to create");
        }
    }
//    We should not use synchronized here as this will make this whole method
//    accessible to only one thread at a time. So, even if the instance is created by
//    a thread earlier, current thread will still wait for other threads to complete
//    to simply return the existing instance
//    public static synchronized DbSingleton getInstance() {
//        if (null == instance) {
//            instance = new DbSingleton();
//        }
//
//        return instance;
//    }

    public static DbSingleton getInstance() {
        if (null == instance) {
            synchronized (DbSingleton.class) {
                if (null == instance) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }
}
