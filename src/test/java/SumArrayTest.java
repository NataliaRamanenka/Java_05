import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {
    @Test
    public void testPositiveHappyPath (){
        int [] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeHappyPath (){
        int [] array = {-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
