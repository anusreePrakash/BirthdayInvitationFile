public class Country {
    private final String country;

    public Country(String country) {
        this.country = country;
    }
    protected Boolean isSameCountry(String otherCountry){
        return this.country.equals(otherCountry) ? true : false;
    }
}
