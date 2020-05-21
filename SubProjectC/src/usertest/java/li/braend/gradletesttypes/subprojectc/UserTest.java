package li.braend.gradletesttypes.subprojectc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testIntegrationA() {
        assertEquals("UserTest add failed", -1, BusinessLogicC.multiply(2, 2));
    }
}
