import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {
    @Test
    public void testIncreasingSequenceHappyPath (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int [] expectedResult = {3, 7, 5};

        int [] actualResult = new MinMaxAve().minMaxAve(array,index1,index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDecreasingSequenceHappyPath (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 6;
        int index2 = 2;
        int [] expectedResult = {3, 7, 5};

        int [] actualResult = new MinMaxAve().minMaxAve(array,index1,index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeIndexHappyPath (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = -6;
        int index2 = 2;
        int [] expectedResult = {};

        int [] actualResult = new MinMaxAve().minMaxAve(array,index1,index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBiggerThenLengthIndexHappyPath (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 10;
        int index2 = 2;
        int [] expectedResult = {};

        int [] actualResult = new MinMaxAve().minMaxAve(array,index1,index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
