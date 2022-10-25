import project_utils.Utils;

public class Algorithms {

    /* Написать метод deleteNumber, который принимает на вход массив целых чисел и число number.
     * Удалите все вхождения числа number из массива (пропусков быть не должно).
     * ({0,1,2,2,3,0,4,2}, 2) -> {0, 1, 3, 0, 4}
     */
    public int[] deleteNumber(int[] arr, int number) {
        if (!new Utils().arrayContainsNumber(arr, number)) {  //проверяем, есть ли число в массиве
            return arr;
        }
        int countNumber = 0;                                   //считаем количество вхождений числа
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                countNumber++;

            }
        }
        int[] resultArray = new int[arr.length - countNumber];
        for (int i = 0; i < resultArray.length; ) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != number) {
                    resultArray[i] = arr[j];
                    i++;
                }
            }
        }

        return resultArray;
    }


    /* Напишите метод removeDuplicates(int[] array) , который возвращает массив,
     * в котором удалены повторяющиеся элементы из массива array
     * Аналогичен методу createUniqueArray() в классе CreateArray
     * /

    /* Напишите метод, который принимает на вход массив double[] array и создает новый массив такой же длины
     * double[] dupArray. Метод берет значение array[i], генерирует новый случайный индекс j для этого
     * значения в новом массиве, и присваивает значение array[i] ячейке dupArray[j]
     * (где j - случайно сгенерированное число).
     * Последние три элемента массива array заполняют пустые ячейки в новом массиве dupArray.
     */


    /* Напишите метод getLast(array, n) , который возвращает фрагмент массива, содержащий последние ‘n’
     * элементов массива. Метод должен работать с массивами типа int[], double[] и String[]
     */
    public int[] getLast(int[] arr, int number) {
        if (arr == null || arr.length == 0 || number > arr.length || number < 0) {  // валидация
            return new int[0];
        }
        int[] resultArray = new int[number];
        for (int i = 0; i < resultArray.length; i++, number--) {
            resultArray[i] = arr[arr.length - number];
        }

        return resultArray;
    }
    public double[] getLast(double[] arr, int number) {
        if (arr == null || arr.length == 0 || number > arr.length || number < 0) {  // валидация
            return new double[0];
        }
        double[] resultArray = new double[number];
        for (int i = 0; i < resultArray.length; i++, number--) {
            resultArray[i] = arr[arr.length - number];
        }

        return resultArray;
    }
    public String[] getLast(String[] arr, int number) {
        if (arr == null || arr.length == 0 || number > arr.length || number < 0) {  // валидация
            return new String[0];
        }
        String[] resultArray = new String[number];
        for (int i = 0; i < resultArray.length; i++, number--) {
            resultArray[i] = arr[arr.length - number];
        }

        return resultArray;
    }
}
