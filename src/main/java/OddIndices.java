import java.util.Arrays;

public class OddIndices {

    /* Написать алгоритм OddIndices, который принимает массив целых чисел,
     * и возвращает массив значений нечетных индексов
     */

    public int[] oddIndices (int [] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                counter++;
            }
        }
        int resultIndex = 0;
        int [] result = new int [counter];
        for (int i = 0; i < array.length; i ++)
            if (i % 2 == 1){
                result [resultIndex] = array[i];
                resultIndex++;
            }

        return result;
    }

}
