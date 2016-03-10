import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {

    @Test
    public void firstNameFirst_gives_first_name_first() throws Exception {
        PersonName personName = new PersonName("raju", "mani");
        Country country = new Country("India");
        Address address = new Address("kolkata", "west bengal", country);
        Person person = new Person(personName, 21, "Male", address);
        assertEquals("Mr raju mani", person.formalLabel());
    }

    @Test
    public void lastNameFirst_gives_last_name_first() throws Exception {
        PersonName personName = new PersonName("raju", "mani");
        Country country = new Country("India");
        Address address = new Address("kolkata", "west bengal", country);
        Person person = new Person(personName, 21, "Male", address);
        assertEquals("Mr mani, raju", person.informalLabel());
    }

    @Test
    public void firstNameFirst_gives_first_name_first_Female() throws Exception {
        PersonName personName = new PersonName("nihara", "arappatt");
        Country country = new Country("India");
        Address address = new Address("kolkata", "west bengal", country);
        Person person = new Person(personName, 21, "Female", address);
        assertEquals("Ms nihara arappatt", person.formalLabel());
    }

    @Test
    public void lastNameFirst_gives_last_name_first_Female() throws Exception {
        PersonName personName = new PersonName("nihara", "arappatt");
        Country country = new Country("India");
        Address address = new Address("kolkata", "west bengal", country);
        Person person = new Person(personName, 21, "Female", address);
        assertEquals("Ms arappatt, nihara", person.informalLabel());
    }

    @Test
    public void getSpecifiedFormatGivesTheResultInTheFormatAsked() throws Exception {
        PersonName personName = new PersonName("raju", "mani");
        Country country = new Country("India");
        Address address = new Address("kolkata", "west bengal", country);
        Person person = new Person(personName, 21, "Male", address);
        assertEquals("Mr raju mani", person.getSpecifiedFormat("--firstLast"));
    }
    @Test
    public void getSpecifiedFormatGivesTheResultInTheFormatAsked2() throws Exception {
        PersonName personName = new PersonName("raju", "mani");
        Country country = new Country("India");
        Address address = new Address("kolkata", "west bengal", country);
        Person person = new Person(personName, 21, "Male", address);
        assertEquals("Mr mani, raju", person.getSpecifiedFormat("--lastFirst"));
    }
}