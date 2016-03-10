public class City {
    private final String city;

    public City(String city) {
        this.city = city;
    }

    public Boolean isSameCity(String otherCity) {
        return this.city.equals(otherCity);
    }
}
