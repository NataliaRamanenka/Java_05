import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {
    @Test
    public void testSortArrayHappyPath (){
        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int [] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        int [] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSortArrayNegative(){
        int [] array = {};
        int [] expectedResult = {};

        int [] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDescendingSortHappyPath (){
        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int [] expectedResult = {12, 12, 9, 7, 5, 4, 4, 3, 2};

        int [] actualResult = new SortArray().descendingSort(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testDescendingSortNegative(){
        int [] array = {};
        int [] expectedResult = {};

        int [] actualResult = new SortArray().descendingSort(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
