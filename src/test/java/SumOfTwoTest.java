import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoTest {
    @Test
    public void testSumOfTwoHappyPath (){
        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9},{7, 5}};

        int[][] actualResult = new SumOfTwo().sumOfTwo(array,n);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
