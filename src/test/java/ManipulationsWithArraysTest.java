import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {
    @Test
    public void testMultiplуArrayByNumberHappyPath (){
        int [] numbers = {1, 2, 3, 4, 5};
        int number = 3;

        int[] expectedResult = {3, 6, 9, 12, 15};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(numbers, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testToDoubleArrayHappyPath (){
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;

        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(number1, number2, number3, number4, number5);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testToIntArrayHappyPath (){
        double [] numbers = {1.1, 2.5, 3.7, 4.0, 5.5};

        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntToStringArrayHappyPath (){
        int [] numbers = {1, 2, 3, 4, 5};

        String[] expectedResult = {"1", "2", "3", "4", "5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testDoubleToStringArrayHappyPath (){
        double [] numbers = {1.1, 2.5, 3.7, 4.0, 5.5};

        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testValuesGreaterThanNumberHappyPath (){
        int [] numbers = {7, 8, 3, 4, 5};
        int number = 2;

        boolean expectedResult = true;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(numbers, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetTheGreaterHalfOddLeftHappyPath (){
        int [] numbers = {7, 8, 3, 4, 5};

        int [] expectedResult = {7, 8, 3};

        int [] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalfOddRightHappyPath (){
        int [] numbers = {7, 8, 3, 4, 5, 9, 9};

        int [] expectedResult = {4, 5, 9, 9};

        int [] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalfEvenLeftHappyPath (){
        int [] numbers = {7, 8, 3, 4, 5, 91};

        int [] expectedResult = {7, 8, 3};

        int [] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetTheGreaterHalfEvenRightHappyPath (){
        int [] numbers = {7, 8, 3, 4, 5, 9, 9, 9};

        int [] expectedResult = {5, 9, 9, 9};

        int [] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetTheGreaterHalfNegativeHappyPath (){
        int [] numbers = {};

        int [] expectedResult = {};

        int [] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }
//    @Test
//    public void testFindNonUniqueValuesHappyPath() {
//
//        int[] arr = new int[]{1, 2, 1, 5, 23, 90, 3, 23, 1};
//
//        int[][] expectedResult = {{1, 3}, {23, 2}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}};
//
//        int[][] actualResult = new ManipulationsWithArrays().findNonUniqueValues(arr);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }

    @Test
    public void testCreateDoubleUniqueArrayHappyPath() {

        int[] arr1 = new int[]{1, 2, 1, 23};
        int[] arr2 = new int[]{5, 23, 90, 3, 23, 1};

        int[] expectedResult = {1, 2, 23, 5, 90, 3};

        int[] actualResult = new ManipulationsWithArrays().createDoubleUniqueArray(arr1, arr2);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCreateDoubleUniqueArrayWithOneNullArrayHappyPath() {

        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{5, 23, 90, 3, 23, 1};

        int[] expectedResult = {5, 23, 90, 3, 1};

        int[] actualResult = new ManipulationsWithArrays().createDoubleUniqueArray(arr1, arr2);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCreateDoubleUniqueArrayNegative() {

        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{};

        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().createDoubleUniqueArray(arr1, arr2);

        Assert.assertEquals(actualResult, expectedResult);
    }



}
