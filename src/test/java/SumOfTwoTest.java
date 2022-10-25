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
    @Test
    public void testNullSumOfTwoHappyPath (){
        int [] array = {};
        int n = 12;
        int[][] expectedResult = {};

        int[][] actualResult = new SumOfTwo().sumOfTwo(array,n);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void test1SumOfTwoHappyPath (){
        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 110;
        int[][] expectedResult = {};

        int[][] actualResult = new SumOfTwo().sumOfTwo(array,n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCopiesSumOfTwoHappyPath (){
        int [] array = {3, 3, 7, 12, 5, 2, 9, 4, 9};
        int n = 12;
        int[][] expectedResult = {{3, 9},{7, 5}};

        int[][] actualResult = new SumOfTwo().sumOfTwo(array,n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfTwoWithoutDeleteHappyPath (){
        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9},{7, 5}};

        int[][] actualResult = new SumOfTwo().sumOfTwoWithoutDelete(array,n);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNullSumOfTwoWithoutDeleteHappyPath (){
        int [] array = {};
        int n = 12;
        int[][] expectedResult = {};

        int[][] actualResult = new SumOfTwo().sumOfTwoWithoutDelete(array,n);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void test1SumOfTwoWithoutDeleteHappyPath (){
        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 110;
        int[][] expectedResult = {};

        int[][] actualResult = new SumOfTwo().sumOfTwoWithoutDelete(array,n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCopiesSumOfTwoWithoutDeleteHappyPath (){
        int [] array = {3, 3, 7, 12, 5, 2, 9, 4, 9};
        int n = 12;
        int[][] expectedResult = {{3, 9},{7, 5}};

        int[][] actualResult = new SumOfTwo().sumOfTwoWithoutDelete(array,n);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
