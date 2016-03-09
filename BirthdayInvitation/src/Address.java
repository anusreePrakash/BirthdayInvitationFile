public class Address {
    protected Country country;
    protected String city;
    protected String place;

    public Address(String place, String city, Country country){
        this.place = place;
        this.city = city;
        this.country = country;
    }
}
