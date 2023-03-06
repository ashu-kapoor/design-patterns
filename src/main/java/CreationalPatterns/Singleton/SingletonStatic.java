package CreationalPatterns.Singleton;

public class SingletonStatic {
    private static SingletonStatic instance;

    static{
        instance = new SingletonStatic();
    }

    private SingletonStatic(){

    }

    public static SingletonStatic getStaticInstance(){
        return instance;
    }

}
