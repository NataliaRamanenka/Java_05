public class SumArray {
    /* Написать алгоритм SumArray, который возвращает сумму всех чисел массива
     */

    public int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
         }
      return sum;
    }
}
