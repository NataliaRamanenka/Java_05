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

}
