import org.junit.Test;

import static org.junit.Assert.*;

public class forceTest {
    @Test
    public void equilibrium()
    {
        int [][] arr={};
        force first = new force();
        assertEquals("The number of forces is out of bounds",first.equilibrium(0,arr));

    }

}