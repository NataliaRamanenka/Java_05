import java.util.Arrays;

public class OddEvenValuesInArray {
    /* Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
     * и возвращает количество четных чисел в этом массиве
     */
    public int countEvenValuesInArray(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    /* Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,
     * и возвращает количество нечетных чисел в этом массиве
     */
    public int countOddValuesInArray(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    /* В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
     * который принимает на вход массив целых чисел и возвращает массив int[2],
     * который содержит количество четных и нечетных элементов входящего массива
     */
//    public int[] countOddEvenValuesInArray(int[] numbers) {
//
//        int counterOdd = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 1) {
//                counterOdd++;
//            }
//        }
//        int[] result = {counterOdd, (numbers.length - counterOdd)};
//        return result;
//    }
    public int[] countOddEvenValuesInArray(int[] numbers) {

        int counterOdd = countOddValuesInArray(numbers);

        int[] result = {counterOdd, (numbers.length - counterOdd)};
        return result;
    }

    /* В классе OddEvenElementsInArray написать метод createOddEvenArray(), который принимает массив
     * целых случайных чисел, и возвращает двумерный массив (массив четных и массив нечетных чисел)
     */
    public int[] createOddArray(int[] numbers) {
        if (numbers.length != 0) {
            int oddCount = countOddValuesInArray(numbers);
            int[] oddArray = new int[oddCount];
            for (int i = 0, j = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 1) {
                    oddArray[j] = numbers[i];
                    j++;
                }
            }
            return oddArray;
        }

        return new int[0];
    }

    public int[] createEvenArray(int[] numbers) {
        if (numbers.length != 0) {
            int evenCount = countEvenValuesInArray(numbers);
            int[] evenArray = new int[evenCount];
            for (int i = 0, j = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    evenArray[j] = numbers[i];
                    j++;
                }
            }
            return evenArray;
        }

        return new int[0];
    }

    public int[][] createOddEvenArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0][0];
        }
        int[] oddArray = new OddEvenValuesInArray().createOddArray(numbers);
        Arrays.toString(oddArray);
        int[] evenArray = new OddEvenValuesInArray().createEvenArray(numbers);
        Arrays.toString(evenArray);
        int[][] OddEvenArray = new int[][]{oddArray, evenArray};

        return OddEvenArray;
    }

}
