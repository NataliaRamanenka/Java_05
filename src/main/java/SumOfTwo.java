import java.util.Arrays;

public class SumOfTwo {
    /* Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,  и число n.
     * Алгоритм  возвращает пары элементов, которые в сумме дают число n.
     */
    public int[][] sumOfTwo(int[] array, int n) {
        if (array.length != 0) { //проверка входящего массива
            //находим минитальную границу значений
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                min = Math.min(array[i], min);
            }
            //убираем дубликаты
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        array[j] = min - 1;
                    }
                }
            }
            //считаем количество уникальных пар
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
                        if (i != j && array[i] + array[j] == n) {
                            sumOfTwo[k][0] = array[i];
                            sumOfTwo[k][1] = array[j];
                            k++;
                        }
                    }
                }
            }

            if (count == 0) {
                return new int[0][0];
            } else {
                return sumOfTwo;
            }
        }
        return new int[0][0];
    }

    public int[][] sumOfTwoWithoutDelete(int[] array, int sum) {
        if (array != null && array.length > 0) {
            int count = 0;
            int[] copyArray = array;

            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == sum && (array[i] != sum || array[j] != sum)) {
                        count++;
                        int[] temp = new int[array.length - 2];
                        for (int l = 0, k = 0; l < array.length; l++) {
                            if (l != i && l != j) {
                                temp[k] = array[l];
                                if (k < temp.length - 1) {
                                    k++;
                                }
                            }
                        }
                        array = temp;
                        i = 0;
                        break;
                    }
                }
            }
            int[][] sumOfTwo = new int[count][2];
            for (int i = 0, s = 0; i < copyArray.length - 1; i++) {
                for (int j = i + 1; j < copyArray.length; j++) {

                    if (copyArray[i] + copyArray[j] == sum && (copyArray[i] != sum || copyArray[j] != sum)) {
                        sumOfTwo[s][0] = copyArray[i];
                        sumOfTwo[s][1] = copyArray[j];
                        if (s < count - 1) {
                            s++;
                        }
                        int[] temp = new int[copyArray.length - 2];
                        for (int l = 0, k = 0; l < copyArray.length; l++) {
                            if (l != i && l != j) {
                                temp[k] = copyArray[l];
                                if (k < temp.length - 1) {
                                    k++;
                                }
                            }
                        }
                        copyArray = temp;
                        i = 0;
                        break;
                    }
                }
            }

            return sumOfTwo;
        } else {

            return new int[0][0];
        }
    }






}
