import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class CountryTest {
    @Test
    public void isSameCountryReturnsTrueForSameCountry() throws Exception {
        Country country = new Country("India");
        assertTrue(country.isSameCountry("India"));
    }
    @Test
    public void isSameCountryReturnsTrueForSameCountryp() throws Exception {
        Country country = new Country("India");
        assertEquals("India",country.toString());
    }
    @Test
    public void  testIsSameCountryReturnsFalseForDifferentCountry() throws Exception {
        Country country = new Country("India");
        assertFalse(country.isSameCountry("Bhutan"));
    }
}
