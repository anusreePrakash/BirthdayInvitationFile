import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GenderTest {

    @Test
    public void setPrefixReturnMrForMale() throws Exception {
        PersonName personName = new PersonName("raju", "mani");
        Country country = new Country("India");
        Address address = new Address("kolkata", "west bengal", country);
        Person person = new Person(personName, 21, "Male", address);
        String prefix = person.setPrefix();
        assertEquals("Mr", prefix);
    }
    @Test
    public void setPrefixReturnMrForFemale() throws Exception {
        PersonName personName = new PersonName("veena", "mani");
        Country country = new Country("India");
        Address address = new Address("kolkata", "west bengal", country);
        Person person = new Person(personName, 21, "Female", address);
        String prefix = person.setPrefix();
        assertEquals("Ms", prefix);
    }
    @Test
    public void setPrefixReturnNullForOthers() throws Exception {
        PersonName personName = new PersonName("veena", "mani");
        Country country = new Country("India");
        Address address = new Address("kolkata", "west bengal", country);
        Person person = new Person(personName, 21, "eale", address);
        String prefix = person.setPrefix();
        assertEquals("", prefix);
    }
}
