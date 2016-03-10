public class Address {
    private Country country;
    private String city;
    private String place;

    public Address(String place, String city, Country country){
        this.place = place;
        this.city = city;
        this.country = country;
    }
}
