public class Singleton {

    private Singleton uniqueInstance;
    
    private Singleton() {}

    public static Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}