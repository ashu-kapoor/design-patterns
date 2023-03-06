package CreationalPatterns.Singleton;

public class LazySingleton {

    //Multi threading is an issue
    private static LazySingleton instance;
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
