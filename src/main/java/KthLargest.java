public class KthLargest{
    /* Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
     * и возвращает k-тый максимальный элемент.
     */

    public int kthLargest(int[] array, int k) {
        if(k > 0 && k <= array.length) {
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

            return array[k-1];
        }
        return 0;
    }

}
