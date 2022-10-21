import java.util.Arrays;

public class NegativeOnTheRight {
    /* Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел,
     * и возвращает массив,  в котором все негативные числа находятся во второй половине массива
     * (массив не должен быть отсортирован)
     */

    public int[] negativeOnTheRight(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] <= 0 && array[j + 1] >=0) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
