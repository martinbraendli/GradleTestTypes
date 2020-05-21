package li.braend.gradletesttypes.subprojectb;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusinessLogicBTest {


    @Test
    public void testSub() {
        assertEquals("UnitTest add failed", 1, BusinessLogicB.sub(2, 1));
    }

}
