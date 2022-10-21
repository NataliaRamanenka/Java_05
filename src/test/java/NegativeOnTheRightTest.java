import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeOnTheRightTest {
    @Test
    public void testNegativeOnTheRightHappyPath (){
        int [] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int [] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        int [] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeOnTheRightWithNullHappyPath (){
        int [] array = {4, -3, 0, -12, 5, -2, 9, 4, 12};
        int [] expectedResult = {4, 5, 9, 4, 12, 0, -3, -12, -2};

        int [] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
