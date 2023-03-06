package CreationalPatterns.Singleton;

public class ThreadSafeSingletonTest {
    public static void main(String[] args) {
        ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
