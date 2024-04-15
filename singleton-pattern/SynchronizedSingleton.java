public class SynchronizedSingleton {

    private SynchronizedSingleton uniqueInstance;
    
    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}