package CreationalPatterns.Singleton;

public class LazySingletonTest {
    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);
    }
}
