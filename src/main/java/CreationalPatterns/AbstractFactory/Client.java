package CreationalPatterns.AbstractFactory;

public class Client {
    private Service service;
    private Response response;

    public Client(DataSourceAbstractFactory factory){
        service = factory.createService();
        response = factory.createResponse();
    }

    public void communicate(){
        System.out.println(service.runService());
        System.out.println(response.getResponse());
    }
}
