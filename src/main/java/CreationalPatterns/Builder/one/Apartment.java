package CreationalPatterns.Builder.one;

public class Apartment {
    private Integer sqm;
    private Integer rooms;
    private String city;
    private String area;
    private Boolean hasKitchen;

    public Apartment(Integer sqm, Integer rooms, String city, String area, Boolean hasKitchen) {
        this.sqm = sqm;
        this.rooms = rooms;
        this.city = city;
        this.area = area;
        this.hasKitchen = hasKitchen;
    }


    public void display() {
        System.out.println("Apartment has : ");
        if(sqm!=null && sqm>0){
            System.out.println("sqm "+sqm);
        }
        if(rooms!=null && rooms>0){
            System.out.println("rooms "+rooms);
        }
        if(city!=null && city!=""){
            System.out.println("city "+city);
        }
        if(area!=null && area !=""){
            System.out.println("area "+area);
        }
        if(hasKitchen){
            System.out.println("hasKitchen "+ hasKitchen);
        }
    }

    public Integer getSqm() {
        return sqm;
    }

    public Integer getRooms() {
        return rooms;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public Boolean isHasKitchen() {
        return hasKitchen;
    }
}
