import org.testng.Assert;
import org.testng.annotations.Test;

public class AlgorithmsTest {
    @Test
    public void testDeleteNumberHappyPath() {

        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int number = 2;

        int[] expectedResult = {0, 1, 3, 0, 4};

        int[] actualResult = new Algorithms().deleteNumber(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testDeleteNumberNegative() {

        int[] arr = new int[]{0, 1, 5, 7, 3, 0, 4, 4};
        int number = 2;

        int[] expectedResult = {0, 1, 5, 7, 3, 0, 4, 4};

        int[] actualResult = new Algorithms().deleteNumber(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testDeleteNumberNullArrayNegative() {

        int[] arr = new int[]{};
        int number = 2;

        int[] expectedResult = {};

        int[] actualResult = new Algorithms().deleteNumber(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetLastIntHappyPath() {

        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int number = 2;

        int[] expectedResult = {4, 2};

        int[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetLastIntNullNumberNegative() {

        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int number = 0;

        int[] expectedResult = {};

        int[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetLastIntNegativeNumber() {

        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int number = -4;

        int[] expectedResult = {};

        int[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetLastIntNullArrayNegative() {

        int[] arr = new int[]{};
        int number = 2;

        int[] expectedResult = {};

        int[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetLastDoubleHappyPath() {

        double[] arr = new double[]{0, 1.6, 2, 2, 3, 0, 4.5, 2};
        int number = 2;

        double[] expectedResult = {4.5, 2};

        double[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetLastDoubleNullNumberNegative() {

        double[] arr = new double[]{0, 1.6, 2, 2, 3, 0, 4.5, 2};
        int number = 0;

        double[] expectedResult = {};

        double[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetLastDoubleNegativeNumber() {

        double[] arr = new double[]{0, 1.6, 2, 2, 3, 0, 4.5, 2};
        int number = -4;

        double[] expectedResult = {};

        double[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetLastDoubleNullArrayNegative() {

        double[] arr = new double[]{};
        int number = 2;

        double[] expectedResult = {};

        double[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetLastStringHappyPath() {

        String[] arr = new String[]{"one", "two", "three", "fore", "five", "six", "seven", "eight"};
        int number = 2;

        String[] expectedResult = {"seven", "eight"};

        String[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetLastStringNullNumberNegative() {

        String[] arr = new String[]{"one", "two", "three", "fore", "five", "six", "seven", "eight"};
        int number = 0;

        String[] expectedResult = {};

        String[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testGetLastStringNegativeNumber() {

        String[] arr = new String[]{"one", "two", "three", "fore", "five", "six", "seven", "eight"};
        int number = -4;

        String[] expectedResult = {};

        String[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetLastStringNullArrayNegative() {

        String[] arr = new String[]{};
        int number = 2;

        String[] expectedResult = {};

        String[] actualResult = new Algorithms().getLast(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
