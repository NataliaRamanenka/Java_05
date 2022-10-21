import java.util.Arrays;

public class SumOfTwo {
    /* Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,  и число n.
     * Алгоритм  возвращает пары элементов, которые в сумме дают число n.
     */
    public int[][] sumOfTwo(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == n) {
                    count++;
                }
            }
        }
        int[][] sumOfTwo = new int[count][2];
        for (int k = 0; k < sumOfTwo.length; ) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == n) {
                        sumOfTwo[k][0] = array[i];
                        sumOfTwo[k][1] = array[j];
                        k++;
                    }
                }
            }

        }


        return sumOfTwo;
}


}
