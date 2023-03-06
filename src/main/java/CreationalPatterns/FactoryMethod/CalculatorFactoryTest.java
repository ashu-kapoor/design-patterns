package CreationalPatterns.FactoryMethod;

public class CalculatorFactoryTest {
    public static void main(String[] args) {
        CalculatorFactory calculatorFactory = new CalculatorFactory();
        Calculator addCalculator = calculatorFactory.getCalculator("ADD");
        Calculator subsCalculator = calculatorFactory.getCalculator("SUB");
        System.out.println(addCalculator.getCalculation(2,3));
        System.out.println(subsCalculator.getCalculation(2,3));
    }
}
