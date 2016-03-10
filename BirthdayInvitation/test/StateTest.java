import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class StateTest {
    @Test
    public void isSameStateReturnsTrueForSameState() throws Exception {
        State state = new State("Kerala");
        assertTrue(state.isSameState("Kerala"));
    }

    @Test
    public void  testIsSameStateReturnsFalseForDifferentState() throws Exception {
        State state = new State("Kerala");
        assertFalse(state.isSameState("goa"));
    }
}
