package CreationalPatterns.AbstractFactory;

public interface DataSourceAbstractFactory {
    Service createService();
    Response createResponse();
}
