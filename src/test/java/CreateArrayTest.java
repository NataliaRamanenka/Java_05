import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.Utils;

public class CreateArrayTest {
    @Test
    public void testCreateArrayHappyPath (){
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;

        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new CreateArray().createIntArray(number1, number2, number3, number4, number5);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateDoubleArrayHappyPath (){
        double number1 = 1.1;
        double number2 = 2.5;
        double number3 = 3.7;
        double number4 = 4.0;
        double number5 = 5.5;

        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        double[] actualResult = new CreateArray().createDoubleArray(number1, number2, number3, number4, number5);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCreateStringArrayHappyPath (){
        String number1 = "It";
        String number2 = "was";
        String number3 = "an";
        String number4 = "apple";
        String number5 = "pie";

        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        String[] actualResult = new CreateArray().createStringArray(number1, number2, number3, number4, number5);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCreateArrayFromTextHappyPath (){
        String sentence= "It was an apple pie";

        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        String[] actualResult = new CreateArray().createArrayFromText(sentence);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArrayFromTextTextWithNegativeHappyPath (){
        String numbers= "19 5 6 -1 41 3 1.3";

        int[] expectedResult = {19, 5, 6, -1, 41, 3, 1};

        int[] actualResult = new CreateArray().createIntArrayFromText(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArrayFromTextWithDoubleTextHappyPath (){
        String numbers= "3 4 1 8 10 12.3";

        int[] expectedResult = {3, 4, 1, 8, 10, 12};

        int[] actualResult = new CreateArray().createIntArrayFromText(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCreateIntArrayFromTextTextWithLettersHappyPath (){
        String numbers= "19 5 r 6 -1 41 3 1.3";

        int[] expectedResult = {19, 5, 6, -1, 41, 3, 1};

        int[] actualResult = new CreateArray().createIntArrayFromText(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCreateIntArrayFromTextTextWithSpecialsHappyPath (){
        String numbers= "19 5 % &^$ 6 -1 41 3 1.3";

        int[] expectedResult = {19, 5, 6, -1, 41, 3, 1};

        int[] actualResult = new CreateArray().createIntArrayFromText(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArrayFromTextTextWithBigSpaseHappyPath (){
        String numbers= "19 5 % &^$ 6          -1 41 3 1.3";

        int[] expectedResult = {19, 5, 6, -1, 41, 3, 1};

        int[] actualResult = new CreateArray().createIntArrayFromText(numbers);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplesOfHappyPath (){
        int number = 2;

        int[] expectedResult = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int[] actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_USA_HappyPath() {

        int[] arr = new int[]{1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};

        String[] expectedResult = {"1(800)123-45-67", "United States of America"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_Canada_HappyPath() {

        int[] arr = new int[]{1, 8, 0, 7, 1, 2, 3, 4, 5, 6, 7};

        String[] expectedResult = {"1(807)123-45-67", "Canada"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_Kazakhstan_HappyPath() {

        int[] arr = new int[]{7, 7, 7, 7, 1, 2, 3, 4, 5, 6, 7};

        String[] expectedResult = {"7(777)123-45-67", "Kazakhstan"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_Russia_HappyPath() {

        int[] arr = new int[]{7, 9, 1, 3, 9, 2, 3, 4, 5, 6, 7};

        String[] expectedResult = {"7(913)923-45-67", "Russia"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_UnitedKingdom12Digits_HappyPath() {

        int[] arr = new int[]{4, 4, 7, 4, 2, 9, 6, 6, 3, 7, 7, 3};

        String[] expectedResult = {"4(474)296-63-773", "United Kingdom"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_Satellite5DigitPrefix17DigitsNumber_HappyPath() {

        int[] arr = new int[]{8, 8, 2, 1, 6, 9, 6, 6, 3, 7, 7, 3, 6, 3, 7, 7, 3};

        String[] expectedResult = {"8(821)696-63-77363773", "Thuraya (Mobile Satellite service)"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_OutOfBoundsDigit_Negative() {

        int[] arr = new int[]{99, 9, 1, 3, 9, 2, 3, 4, 5, 6, 7};

        String[] expectedResult = {"Error"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_OutOfBoundsLength18_Negative() {

        int[] arr = new int[]{8, 8, 2, 1, 6, 9, 6, 6, 3, 7, 7, 3, 6, 3, 7, 7, 3, 9};

        String[] expectedResult = {"Error"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_SmallArr_Negative() {

        int[] arr = new int[]{9, 7};

        String[] expectedResult = {"Error"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCreateUniqueArrayHappyPath() {

        int[] arr = new int[]{1, 2, 1, 5, 23, 90, 3, 43, 23, 1};

        int[] expectedResult = {1, 2, 5, 23, 90, 3, 43};

        int[] actualResult = new CreateArray().createUniqueArray(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCreateUniqueArrayWithNegativeNumber() {

        int[] arr = new int[]{3, -6, 4, 9, 10};

        int[] expectedResult = {};

        int[] actualResult = new CreateArray().createUniqueArray(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCreateUniqueArrayWithNull() {

        int[] arr = new int[]{3, 0, 4, 9, 10};

        int[] expectedResult = {};

        int[] actualResult = new CreateArray().createUniqueArray(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCreateUniqueArrayEmptyNegative() {

        int[] arr = new int[]{};

        int[] expectedResult = {};

        int[] actualResult = new CreateArray().createUniqueArray(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFollowedNumberHappyPath() {

        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number = 6;
        boolean found = new Utils().arrayContainsNumber(arr,number);
        System.out.println(found);

        int[] expectedResult = {7, 8, 9};

        int[] actualResult = new CreateArray().createArrayFollowedNumber(arr,number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFollowedNumberWithoutNumberNegative() {

        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 7, 8, 9};
        int number = 6;

        int[] expectedResult = {};

        int[] actualResult = new CreateArray().createArrayFollowedNumber(arr,number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCreateArrayFollowedNumberTheLastNumberNegative() {

        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6};
        int number = 6;

        int[] expectedResult = {};

        int[] actualResult = new CreateArray().createArrayFollowedNumber(arr,number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFollowedNumberEmptyArrayNegative() {

        int[] arr = new int[]{};
        int number = 6;

        int[] expectedResult = {};

        int[] actualResult = new CreateArray().createArrayFollowedNumber(arr,number);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
