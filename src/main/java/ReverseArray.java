import java.util.Arrays;

public class ReverseArray {
    /* Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
     * и возвращает “перевернутый” массив.
     */
    public int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int j = 0; j < reverseArray.length; j++) {
            reverseArray[j] = array[array.length - 1 - j];
        }

        return reverseArray;
    }


}
