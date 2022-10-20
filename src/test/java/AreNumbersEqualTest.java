import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {
    @Test
    public void testNumber1EqualNumber2HappyPath (){
        int number1 = 89;
        int number2 = 89;

        int expectedResult = 0;

        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNumber1LessNumber2HappyPath (){
        int number1 = -89;
        int number2 = 89;

        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNumber1BiggerNumber2HappyPath (){
        int number1 = 89;
        int number2 = -89;

        int expectedResult = 1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
