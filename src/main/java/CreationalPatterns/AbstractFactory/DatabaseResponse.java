package CreationalPatterns.AbstractFactory;

public class DatabaseResponse implements Response{
    @Override
    public String getResponse() {
        return "Database response";
    }
}
