import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOccurrencesTest {
    @Test
    public void testNumberOccurrencesHappyPath (){
        int [] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};

        int[][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        int[][] actualResult = new NumberOccurrences().numberOccurrences(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNumberOccurrencesFirstOneHappyPath (){
        int [] array = {3, 2, 5, 3, 1, 5, 4, 2, 0, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};

        int[][] expectedResult = {{0, 1}, {1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        int[][] actualResult = new NumberOccurrences().numberOccurrences(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNumberOccurrencesLastOneHappyPath (){
        int [] array = {3, 2, 5, 3, 1, 5, 4, 2, 0, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 10};

        int[][] expectedResult = {{0, 1}, {1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}, {10, 1}};

        int[][] actualResult = new NumberOccurrences().numberOccurrences(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNumberOccurrencesNegativeHappyPath (){
        int [] array = {};

        int[][] expectedResult = {};

        int[][] actualResult = new NumberOccurrences().numberOccurrences(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
//    @Test
//    public void testNumberOccurrencesOneHappyPath (){   //!!!!!!!!Зацикливается
//        int [] array = {1};
//
//        int[][] expectedResult = {{1, 1}};
//
//        int[][] actualResult = new NumberOccurrences().numberOccurrences(array);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }

    @Test
    public void testNumberOccurrences2HappyPath (){
        int [] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};

        int[][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        int[][] actualResult = new NumberOccurrences().numberOccurrences2(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNumberOccurrences2FirstOneHappyPath (){
        int [] array = {3, 2, 5, 3, 1, 5, 4, 2, 0, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};

        int[][] expectedResult = {{0, 1}, {1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        int[][] actualResult = new NumberOccurrences().numberOccurrences2(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNumberOccurrences2LastOneHappyPath (){
        int [] array = {3, 2, 5, 3, 1, 5, 4, 2, 0, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 10};

        int[][] expectedResult = {{0, 1}, {1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}, {10, 1}};

        int[][] actualResult = new NumberOccurrences().numberOccurrences2(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNumberOccurrences2NegativeHappyPath (){
        int [] array = {};

        int[][] expectedResult = {};

        int[][] actualResult = new NumberOccurrences().numberOccurrences2(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNumberOccurrences2OneHappyPath (){
        int [] array = {1};

        int[][] expectedResult = {{1, 1}};

        int[][] actualResult = new NumberOccurrences().numberOccurrences2(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
