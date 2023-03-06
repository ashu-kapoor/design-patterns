package CreationalPatterns.Builder.one;

public class ApartmentBuilder {
    private Integer sqm = -1;
    private Integer rooms = -1;
    private String city = "";
    private String area = "";
    private Boolean hasKitchen = false;

    public Apartment build(){
        Apartment apartment = new Apartment(sqm,rooms,city,area,hasKitchen);
        sqm = -1;
        rooms = -1;
        city = "";
        area = "";
        hasKitchen = false;
        return apartment;
    }

    public ApartmentBuilder setSqm(Integer sqm) {
        this.sqm = sqm;
        return this;
    }

    public ApartmentBuilder setRooms(Integer rooms) {
        this.rooms = rooms;
        return this;
    }

    public ApartmentBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public ApartmentBuilder setArea(String area) {
        this.area = area;
        return this;
    }

    public ApartmentBuilder setHasKitchen(Boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
        return this;
    }
}
