import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {
    @Test
    public void testReverseArrayHappyPath (){
        int [] array = {2, 7, 3, 10};
        int [] expectedResult = {10, 3, 7, 2};

        int [] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
