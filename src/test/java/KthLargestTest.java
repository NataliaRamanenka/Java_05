import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {
    @Test
    public void testKthLargestHappyPath (){
        int k = 3;
        int [] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int expectedResult = 9;

        int actualResult = new KthLargest().kthLargest(array, k);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testKthLargestInvalidIndexHappyPath (){
        int k = 10;
        int [] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int expectedResult = 0;

        int actualResult = new KthLargest().kthLargest(array, k);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
