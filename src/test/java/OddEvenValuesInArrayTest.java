import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {
    @Test
    public void testCountEvenValuesInArrayHappyPath (){
        int [] numbers = {7, 8, 3, 4, 5};

        int expectedResult = 2;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddValuesInArrayHappyPath (){
        int [] numbers = {7, 8, 3, 4, 5};

        int expectedResult = 3;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCountOddEvenValuesInArrayHappyPath (){
        int [] numbers = {7, 8, 3, 4, 5, 10};

        int [] expectedResult = {3, 3};

        int [] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateOddEvenArrayHappyPath (){
        int [] numbers = {7, 8, 3, 4, 5};

        int [][] expectedResult = {{7, 3, 5}, {8, 4}};

        int [][] actualResult = new OddEvenValuesInArray().createOddEvenArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateOddEvenArrayNegativeHappyPath (){
        int [] numbers = {};

        int [][] expectedResult = {};

        int [][] actualResult = new OddEvenValuesInArray().createOddEvenArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
