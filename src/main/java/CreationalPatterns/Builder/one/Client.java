package CreationalPatterns.Builder.one;

public class Client {
    public static void main(String[] args) {
        ApartmentBuilder builder = new ApartmentBuilder();
        Apartment apartment = builder.setArea("12").setCity("Paris").setHasKitchen(true).build();
        apartment.display();
        Apartment apartment2 = builder.setArea("12").setCity("Tokyo").setRooms(2).build();
        apartment2.display();
    }
}
