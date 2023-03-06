package CreationalPatterns.Singleton;

public class SingletonStaticTest {
    public static void main(String[] args) {
        SingletonStatic singletonStatic1 = SingletonStatic.getStaticInstance();
        SingletonStatic singletonStatic2 = SingletonStatic.getStaticInstance();
        System.out.println(singletonStatic1);
        System.out.println(singletonStatic2);
    }
}
