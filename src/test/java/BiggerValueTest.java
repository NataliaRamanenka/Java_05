import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    @Test
    public void testHappyPath (){
        int number1 = 3333;
        int number2 = 9999;
        int expectedResult = 9999;

        int actualResult = new BiggerValue().biggerValue(number1,number2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

