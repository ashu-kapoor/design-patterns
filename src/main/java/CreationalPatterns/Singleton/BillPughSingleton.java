package CreationalPatterns.Singleton;

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    private static class InnerStaticClass{
        private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){

        return InnerStaticClass.billPughSingleton;
    }
}
