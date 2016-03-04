import Gender.Gender;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DetailsTest {

    @Test
    public void Details_gives_ms_for_girls() throws Exception {
        PersonName personName = new PersonName("anusree", "prakash");
        Address address = new Address("kothamangalam", "kerala", "India");
        Details details = new Details(personName,21,address);
        details.setGender(Gender.FEMALE);
        assertEquals("Ms",details.setPrefix());
    }
    @Test
    public void Details_gives_mr_for_men() throws Exception {
        PersonName personName = new PersonName("sayan", "bisui");
        Address address = new Address("kolkata", "west bengal", "India");
        Details details = new Details(personName,21,address);
        details.setGender(Gender.MALE);
        assertEquals("Mr",details.setPrefix());
    }
    @Test
    public void firstNameFirst_gives_first_name_first() throws Exception {
        PersonName personName = new PersonName("sayan", "bisui");
        Address address = new Address("kolkata", "west bengal", "India");
        Details details = new Details(personName,21,address);
        details.setGender(Gender.MALE);
        assertEquals("Mr sayan bisui",details.firstNameFirst());
    }
    @Test
    public void lastNameFirst_gives_last_name_first() throws Exception {
        PersonName personName = new PersonName("sayan", "bisui");
        Address address = new Address("kolkata", "west bengal", "India");
        Details details = new Details(personName,21,address);
        details.setGender(Gender.MALE);
        assertEquals("Mr bisui, sayan",details.lastNameFirst());
    }
    @Test
    public void getFirstNameWithCountry_gives_last_name_first_with_country() throws Exception {
        PersonName personName = new PersonName("sayan", "bisui");
        Address address = new Address("kolkata", "west bengal", "India");
        Details details = new Details(personName,21,address);
        details.setGender(Gender.MALE);
        assertEquals("Mr sayan bisui, India",details.firstNameFirstwithCountry());
    }
    @Test
    public void getLastNameWithCountry_gives_last_name_first_with_country() throws Exception {
        PersonName personName = new PersonName("sayan", "bisui");
        Address address = new Address("kolkata", "west bengal", "India");
        Details details = new Details(personName,21,address);
        details.setGender(Gender.MALE);
        assertEquals("Mr bisui, sayan, India",details.lastNameFirstwithCountry());
    }

}