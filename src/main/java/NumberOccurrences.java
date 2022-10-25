import java.util.Arrays;

public class NumberOccurrences {
    /* Написать алгоритм NumberOccurrences,  который принимает на вход массив целых чисел,
     * и возвращает массив пар {число, сколько раз число встречается в массиве}
     */
    public int[][] numberOccurrences(int[] array) {
        if (array == null || array.length == 0) { // Валидация
            return new int[0][0];
        }

        int[] sortArray = new SortArray().sortArray(array); // Сортируем массив

        int count = 1;
        for (int i = 1; i < sortArray.length; i++) { // Считаем уникальные пары, т.е.количество строчек двумерного массива
            if (sortArray[i] != sortArray[i - 1]) {
                count++;
            }
        }

        int[][] numberOccurrences = new int[count][2];
        count = 1;                                              // Считчик для количества повторения уникального значения

        for (int k = 0; k < numberOccurrences.length; ) {  // Заполняем строчки двумерного массива

            for (int i = 1; i < sortArray.length; i++) {   // Заполняем столбцы двумерного массива
                if (sortArray[0] != sortArray[1] && k == 0) {
                    numberOccurrences[0][0] = sortArray[0];
                    numberOccurrences[0][1] = 1;
                    k++;
                } else if (sortArray[sortArray.length - 1] != sortArray[sortArray.length - 2]
                        && k == (numberOccurrences.length - 1)) {
                    numberOccurrences[numberOccurrences.length - 1][0] = sortArray[sortArray.length - 1];
                    numberOccurrences[numberOccurrences.length - 1][1] = 1;
                    k++;
                    break;
                } else if (sortArray[i] == sortArray[i - 1] && i != (sortArray.length - 1)) {
                    count++;
                } else if (sortArray[i] == sortArray[i - 1] && i == (sortArray.length - 1)) {
                    numberOccurrences[numberOccurrences.length - 1][0] = sortArray[sortArray.length - 1];
                    numberOccurrences[numberOccurrences.length - 1][1] = count + 1;
                    k++;
                    break;
                } else if (sortArray[i] != sortArray[i - 1]) {
                    numberOccurrences[k][0] = sortArray[i - 1];
                    numberOccurrences[k][1] = count;
                    k++;
                    count = 1;
                }
            }
        }

        return numberOccurrences;
    }

    public static int[][] numberOccurrences2(int[] arr) {

        if (arr == null || arr.length == 0) {
            return new int[0][0];
        }

        int[] sortArray = new SortArray().sortArray(arr);                                // Сортируем массив (ССЫЛКА НА ВАШ КЛАСС/МЕТОД СОРТИРОВКИ)

        int uniqNumbers = 1;
        for (int i = 1; i < arr.length; i++) {                              // считаем уникальные числа в массиве(это будет количеством пар в итоговом двумерном)
            if (arr[i] != arr[i - 1]) {
                uniqNumbers++;
            }
        }

        int[][] resultArr = new int[uniqNumbers][2];

        int counter = 1;                                                    // счетчик повторяющихся цифр
        int resultArrIndex = 0;                                             // индекс двумерного массива

        if (arr.length == 1) {                                              // если массив длиной 1 (в for нельзя т.к. for будет от 1 до < 0)
            resultArr[resultArrIndex] = new int[]{arr[0], 1};               // рисуем пару в двумерном масссиве
        }

        for (int i = 1; i < arr.length; i++) {
            if (i == 1 && arr[i] != arr[i - 1]) {                           // если 0 элемент массива встречается 1 раз
                resultArr[resultArrIndex] = new int[]{arr[0], 1};           // рисуем пару про него в двумерном масссиве
                resultArrIndex++;                                           // переводим на следующий индекс двумерного массива
            } else if (arr[i] == arr[i - 1] && i == arr.length - 1) {       // если последний элемент массива не одинок
                resultArr[resultArrIndex] = new int[]{arr[i], counter + 1};
            } else if (arr[i] != arr[i - 1] && i == arr.length - 1) {       // если последний элемент массива единственный
                resultArr[resultArrIndex] = new int[]{arr[i - 1], counter}; // рисуем прошлую пару
                resultArr[resultArrIndex + 1] = new int[]{arr[i], 1};       // рисуем последнюю пару про последний элемент
            } else if (arr[i] == arr[i - 1]) {                              // считаем повторяющиеся цифры (не на краях массива)
                counter++;
            } else if (arr[i] != arr[i - 1]) {                              // если появилось новое число (не на краях массива)
                resultArr[resultArrIndex] = new int[]{arr[i - 1], counter}; // рисуем пару про предыдущее в двумерном масссиве
                resultArrIndex++;                                           // переводим на следующий индекс двумерного массива
                counter = 1;                                                //сбрасываем счетчик повторяющихся цифр
            }
        }

        return resultArr;
    }

}
