package CreationalPatterns.FactoryMethod;

public class CalculatorFactory {
    public Calculator getCalculator(String type){
        if(type==null){
            return null;
        }

        switch (type){
            case "ADD": return new Add();
            case "SUB": return new Substract();
            case "MUL": return new Multiply();
            case "DIV": return new Divide();
            default: throw new IllegalArgumentException("Unknown calculator");

        }
    }
}
