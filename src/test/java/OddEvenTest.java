import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
    /* 1. Positive testing Happy path
     * -345 →  “Odd”
     */

    @Test
    public void testNegativeOddNumber(){
        int number = -345;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNul(){
        int number = 0;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testPositiveEvenNumber(){
        int number = 222222;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
