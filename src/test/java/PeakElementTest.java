import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {
    @Test
    public void testSequence1HappyPath (){
        int [] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int [] expectedResult = {3, 7, 23};

        int [] actualResult = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSequence2HappyPath (){
        int [] array = {3, 10, 7, 5, 11, 9, 2, 9};
        int [] expectedResult = {10, 11, 9};

        int [] actualResult = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testSequence3HappyPath (){
        int [] array = {3, 7, 9, 9, 2, 9};
        int [] expectedResult = {9};

        int [] actualResult = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testSequence4HappyPath (){
        int [] array = {3, 7, 9, 9, 2, 2};
        int [] expectedResult = {};

        int [] actualResult = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
