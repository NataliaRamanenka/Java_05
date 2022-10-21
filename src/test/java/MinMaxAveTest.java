import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {
    @Test
    public void testIncreasingSequenceHappyPath (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        double [] expectedResult = {3, 7, 5};

        double [] actualResult = new MinMaxAve().minMaxAve(array,index1,index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDecreasingSequenceHappyPath (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 6;
        int index2 = 2;
        double [] expectedResult = {3, 7, 5};

        double [] actualResult = new MinMaxAve().minMaxAve(array,index1,index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeIndexHappyPath (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = -6;
        int index2 = 2;
        double [] expectedResult = {};

        double [] actualResult = new MinMaxAve().minMaxAve(array,index1,index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBiggerThenLengthIndexHappyPath (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 10;
        int index2 = 2;
        double [] expectedResult = {};

        double [] actualResult = new MinMaxAve().minMaxAve(array,index1,index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIncreasing2SequenceHappyPath (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 5;
        int index2 = 6;
        double [] expectedResult = {6, 7, 6.5};

        double [] actualResult = new MinMaxAve().minMaxAve(array,index1,index2);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testEqualIndexSequenceHappyPath (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 6;
        int index2 = 6;
        double [] expectedResult = {7, 7, 7};

        double [] actualResult = new MinMaxAve().minMaxAve(array,index1,index2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
