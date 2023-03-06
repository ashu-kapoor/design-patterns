package CreationalPatterns.FactoryMethod;

public class Add implements Calculator{

    @Override
    public String getCalculation(int a, int b) {
        return String.valueOf(a+b);
    }
}
