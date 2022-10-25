import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {
    @Test
    public void testSequence1HappyPath (){
        int [] array1 = {1, 2, 4, 5, 89};
        int [] array2 = {8, 9, 4, 2};
        int [] expectedResult = {2, 4};

        int [] actualResult = new Intersection().intersection(array1,array2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSequence2HappyPath (){
        int [] array1 = {1, 2, 4, 5, 8, 9};
        int [] array2 = {8, 9, -4, -2};
        int [] expectedResult = {8, 9};

        int [] actualResult = new Intersection().intersection(array1,array2);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNullSequenceHappyPath (){
        int [] array1 = {1, 2, 4, 5, 89};
        int [] array2 = {8, 9, 45};
        int [] expectedResult = {};

        int [] actualResult = new Intersection().intersection(array1,array2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSequenceCopiesHappyPath (){
        int [] array1 = {1, 2, 4, 2, 4};
        int [] array2 = {2, 9, 4, 2};
        int [] expectedResult = {2, 4};

        int [] actualResult = new Intersection().intersection(array1,array2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
