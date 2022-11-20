package theory.singletonExample;

public class SingletonExample {

    private static SingletonExample singleton = new SingletonExample();

    private SingletonExample() {
    }

    public static SingletonExample getSingleton() {
        return singleton;
    }
}
