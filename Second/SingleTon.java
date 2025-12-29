//SingleTon class: A class with only one object or instance
package Second;

public class Singleton {

    // private constructor
    private Singleton() {
    }

    // static inner helper class
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }
    // global access point
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

