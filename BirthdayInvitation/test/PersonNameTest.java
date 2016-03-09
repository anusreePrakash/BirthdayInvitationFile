import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonNameTest {
    @Test
    public void getFirstNameGivesFirstNameFirst() throws Exception {
        PersonName personName = new PersonName("anu", "prakash");
        assertEquals("anu prakash", personName.getFirstName());

    }
    @Test
    public void getFirstNameGivesLastNameFirst() throws Exception {
        PersonName personName = new PersonName("anu", "prakash");
        assertEquals("prakash, anu", personName.getLastName());

    }
}
