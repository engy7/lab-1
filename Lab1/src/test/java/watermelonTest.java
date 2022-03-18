import static org.junit.Assert.*;
import org.junit.Test;
public class watermelonTest {

    @Test

    public void divideWatermelon()

    {
       watermelon water= new watermelon();
       assertEquals( "NO",water.divideWatermelon(7));
    }


}