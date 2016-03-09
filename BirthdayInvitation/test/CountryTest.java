import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class CountryTest {
    @Test
    public void isSameCountryReturnsTrueForSameCountry() throws Exception {
        Country country = new Country("India");
        assertTrue(country.isSameCountry("India"));
    }
    @Test
    public void  testIsSameCountryReturnsTrueForSameCountry() throws Exception {
        Country country = new Country("India");
        assertFalse(country.isSameCountry("Bhutan"));
    }
}
