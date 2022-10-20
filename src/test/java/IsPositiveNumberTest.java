import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
    @Test
    public void testPositiveHappyPath (){
        int number = 555;

        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNullHappyPath (){
        int number = 0;

        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeHappyPath (){
        int number = -555;

        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
