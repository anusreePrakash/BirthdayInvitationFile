import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonNameTest {
    @Test
    public void formalNameFormatGivesFirstNameFirst() throws Exception {
        PersonName personName = new PersonName("anu", "prakash");
        assertEquals("anu prakash", personName.formalNameFormat());
    }
    @Test
    public void inFormalNameFormatGivesLastNameFirst() throws Exception {
        PersonName personName = new PersonName("anu", "prakash");
        assertEquals("prakash, anu", personName.inFormalNameFormat());

    }
}
