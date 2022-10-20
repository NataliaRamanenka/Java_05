import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {
    @Test
    public void testHappyPath (){
        int [] array = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {590, 985, 68};

        int [] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
