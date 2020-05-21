package li.braend.gradletesttypes.subprojectb;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckerTest {

    @Test
    public void testCheckerB() {
        assertEquals("CheckerTest add failed", 0, BusinessLogicB.sub(1, 1));
    }
}
