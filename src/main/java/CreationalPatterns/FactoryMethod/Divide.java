package CreationalPatterns.FactoryMethod;

public class Divide implements Calculator{

    @Override
    public String getCalculation(int a, int b) {
        return String.valueOf(a/b);
    }
}
