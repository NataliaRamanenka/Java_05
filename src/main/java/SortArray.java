import java.util.Arrays;

public class SortArray {
    /* Написать алгоритм SortArray, который принимает на вход массив целых чисел,
     * и сортирует элементы массива в порядке возрастания.
     */
    public int[] sortArray(int[] array) {
        if (array == null || array.length == 0){
            return new int[0];
        }
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
    /* Напишите метод descendingSort(int[] array) , который возвращает массив, элементы которого
     * отсортированы по убыванию их значений.
     */
    public int[] descendingSort(int[] array) {
        if (array == null || array.length == 0){
            return new int[0];
        }
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
