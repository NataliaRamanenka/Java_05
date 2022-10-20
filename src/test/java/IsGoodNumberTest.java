import org.testng.Assert;
import org.testng.annotations.Test;

public class IsGoodNumberTest {
    @Test
    public void testDivSevenAndNineHappyPath(){
        int number = 63;
        String expectedResult = "хорошее число";

        String actualResult = new IsGoodNumber().isGoodNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDivNineHappyPath(){
        int number = 81;
        String expectedResult = "неверное число";

        String actualResult = new IsGoodNumber().isGoodNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDivElevenHappyPath(){
        int number = 11;
        String expectedResult = "плохое число";

        String actualResult = new IsGoodNumber().isGoodNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testDivNotSevenNineAndElevenHappyPath(){
        int number = 80;
        String expectedResult = "-1";

        String actualResult = new IsGoodNumber().isGoodNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testDivSevenNineAndElevenHappyPath(){
        int number = 99 * 7;
        String expectedResult = "хорошее число";

        String actualResult = new IsGoodNumber().isGoodNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testDivNineAndElevenHappyPath(){
        int number = 99;
        String expectedResult = "неверное число";

        String actualResult = new IsGoodNumber().isGoodNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
