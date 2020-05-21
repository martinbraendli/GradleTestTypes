package li.braend.gradletesttypes.subprojecta;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    @Test
    public void testIntegrationA() {
        assertEquals("IntegrationTest add failed", 2, BusinessLogicA.add(1, 1));
    }
}
