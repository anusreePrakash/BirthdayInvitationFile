import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class CityTest {
    @Test
    public void isSameCityReturnsTrueForSameCity() throws Exception {
        City city = new City("Kochi");
        assertTrue(city.isSameCity("Kochi"));
    }

    @Test
    public void  testIsSameCityReturnsFalseForDifferentCity() throws Exception {
        City city = new City("Kochi");
        assertFalse(city.isSameCity("Kolkata"));
    }
}