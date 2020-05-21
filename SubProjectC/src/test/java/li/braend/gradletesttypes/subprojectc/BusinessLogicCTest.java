package li.braend.gradletesttypes.subprojectC;

import li.braend.gradletesttypes.subprojectc.BusinessLogicC;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusinessLogicCTest {


    @Test
    public void testMultiply() {
        assertEquals("UnitTest multiply failed", 4, BusinessLogicC.multiply(2, 2));
    }

}
