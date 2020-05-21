package li.braend.gradletesttypes.subprojecta;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusinessLogicATest {


    @Test
    public void testAdd() {
        assertEquals("UnitTest add failed", 2, BusinessLogicA.add(1, 1));
    }

}
