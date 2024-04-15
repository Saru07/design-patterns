public class DoubleCheckedSingleton {

    private volatile DoubleCheckedSingleton uniqueInstance;
    /*
     * The volatile keyword ensures that multiple threads handle this variable correctly 
     * when being initialized
     */
    
    private DoubleCheckedSingleton() {}

    public static DoubleCheckedSingleton getInstance() {
        if(uniqueInstance == null) {
            synchronized(DoubleCheckedSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}