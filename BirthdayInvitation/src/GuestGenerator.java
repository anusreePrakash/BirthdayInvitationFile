import java.util.ArrayList;

public class GuestGenerator {
    private ArrayList<Person> guests = new ArrayList<>();

    public GuestGenerator() {}

    public ArrayList<Person> generateGuests(String content) {
        String[] data, csv;
        data = new String(content).split("\n");
        for (String string : data) {
            csv = string.split(",");
            PersonName personName = new PersonName(csv[0], csv[1]);
            Country country = new Country(csv[6]);
            Address address = new Address(csv[4], csv[5], country);
            Person person = new Person(personName, Integer.parseInt(csv[3]), csv[2], address);
            guests.add(person);
        }
        return guests;
    }
}
