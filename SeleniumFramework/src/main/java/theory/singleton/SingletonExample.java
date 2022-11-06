package theory.singleton;

public class SingletonExample {

    private static SingletonExample singleton = new SingletonExample();

    private SingletonExample() {
    }

    public static SingletonExample getSingleton() {
        return singleton;
    }
}
