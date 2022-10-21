public class PeakElement {
    /* Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает
     * значения пиковых элементов (элементы, которые больше своих соседей).
     */
    public int[] peakElement(int[] array) {
        int counter = 0;
        if (array[0] > array[1]) {
            counter++;
        }
        if (array[array.length - 1] > array[array.length - 2]) {
            counter++;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i] > array[i + 1]) && (array[i] > array[i - 1])) {
                counter++;
            }
        }
        int[] commonArray = new int[counter];

        for (int k = 0; k < counter; ) {
            if (array[0] > array[1]) {
                commonArray[0] = array[0];
                k++;
            }
            for (int i = 1; i < array.length - 1; i++) {
                if ((array[i] > array[i + 1]) && (array[i] > array[i - 1])) {
                    commonArray[k] = array[i];
                    k++;
                }
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                commonArray[commonArray.length - 1] = array[array.length - 1];
                k++;
            }

        }
        if (counter != 0) {

            return commonArray;
        } else {

            return new int[0];
        }
    }


}
