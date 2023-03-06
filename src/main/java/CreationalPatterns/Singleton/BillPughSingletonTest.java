package CreationalPatterns.Singleton;

public class BillPughSingletonTest {
    public static void main(String[] args) {
        BillPughSingleton singleton1 = BillPughSingleton.getInstance();
        BillPughSingleton singleton2 = BillPughSingleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
