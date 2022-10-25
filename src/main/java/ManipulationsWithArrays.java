public class ManipulationsWithArrays {
    /*Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
     * Метод возвращает массив тех же чисел, умноженных на number
     */
    public int[] multiplуArrayByNumber(int[] numbers, int number) {
        int[] multiplуArrayByNumber = new int[numbers.length];
        for (int i = 0; i < multiplуArrayByNumber.length; i++) {
            multiplуArrayByNumber[i] = numbers[i] * number;
        }
        return multiplуArrayByNumber;
    }

    /*Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
     * и возвращает массив типа double[] из тех же чисел
     */
    public double[] toDoubleArray(int number1, int number2, int number3, int number4, int number5) {
        double[] toDoubleArray = {number1, number2, number3, number4, number5};
        return toDoubleArray;
    }

    /* Написать метод toIntArray(), который принимает на вход массив типа double[],
     * и возвращает массив типа int[] из тех же чисел
     */
    public int[] toIntArray(double[] numbers) {
        int[] toIntArray = new int[numbers.length];
        for (int i = 0; i < toIntArray.length; i++) {
            toIntArray[i] = (int) numbers[i];
        }

        return toIntArray;
    }

    /* Написать метод toStringArray(), который принимает на вход массив целых чисел,
     * и возвращает массив типа String[] из тех же чисел (желательно не использовать метод .toString(),
     * нужно переводить вручную)
     */
    public String[] toStringArray(int[] numbers) {
        String[] toStringArray = new String[numbers.length];
        for (int i = 0; i < toStringArray.length; i++) {
            toStringArray[i] = String.valueOf(numbers[i]);
        }
        return toStringArray;
    }

    /* Перегрузить метод toStringArray() параметром double[]. Этот метод должен возвращать массив типа
     * String[] (желательно не использовать метод .toString(), нужно переводить вручную)
     */
    public String[] toStringArray(double[] numbers) {
        String[] toStringArray = new String[numbers.length];
        for (int i = 0; i < toStringArray.length; i++) {
            toStringArray[i] = String.valueOf(numbers[i]);
        }
        return toStringArray;
    }

    /* В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
     * который принимает на вход массив целых чисел и число number. Метод возвращает значение true,
     * если все элементы массива больше number, иначе возвращает false
     */
    public boolean areValuesGreaterThanNumber(int[] numbers, int number) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > number) {
                counter++;
            }
        }
        if (counter == numbers.length) {
            return true;
        }
        return false;
    }

    /* В классе ManipulationsWithArrays написать метод getTheGreaterHalf(), который принимает массив целых
     * чисел,  и возвращает  массив из суммарно бОльшей первой или второй половины входящего массива
     */
    public int[] getTheGreaterHalf(int[] numbers) {
        if (numbers.length != 0) { //проверка входящего массива
            int sumLeft = 0;
            int sumRight = 0;
            if (numbers.length % 2 == 0) { //четное количество элементов
                int[] arrayLeft = new int[numbers.length / 2];
                for (int i = 0; i < numbers.length / 2; i++) {
                    sumLeft = sumLeft + numbers[i];
                    arrayLeft[i] = numbers[i];
                }
                int[] arrayRight = new int[numbers.length / 2];
                for (int i = (numbers.length / 2), j = 0; i < numbers.length; i++, j++) {
                    sumRight = sumRight + numbers[i];
                    arrayRight[j] = numbers[i];
                }
                if (sumLeft >= sumRight) {
                    return arrayLeft;
                } else {
                    return arrayRight;
                }
            } else { //нечетное количество элементов
                int[] arrayLeft = new int[(numbers.length + 1) / 2];
                for (int i = 0; i < (numbers.length + 1) / 2; i++) {
                    sumLeft = sumLeft + numbers[i];
                    arrayLeft[i] = numbers[i];
                }
                int[] arrayRight = new int[(numbers.length + 1) / 2];
                for (int i = ((numbers.length + 1) / 2 - 1), j = 0; i < numbers.length; i++, j++) {
                    sumRight = sumRight + numbers[i];
                    arrayRight[j] = numbers[i];
                }
                if (sumLeft >= sumRight) {
                    return arrayLeft;
                } else {
                    return arrayRight;
                }
            }
        }

        return new int[0];
    }

    /* В классе ManipulationsWithArrays написать метод findNonUniqueValues(), который принимает на вход
     * массив целых положительных чисел, и возвращает количество неуникальных элементов в виде
     * двумерного массива {{n, c}}, где n = неуникальное число и с = сколько таких чисел найдено
     * Например, findNonUniqueValues({1, 2, 1, 5, 23, 90, 3, 43, 23, 1}) -> {{1, 3}, {23, 2}}
     */
//    public int[][] findNonUniqueValues(int[] arr) {
//        if (arr == null || arr.length == 0) { // Валидация длины массива
//            return new int[0][0];
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <= 0) {
//                return new int[0][0]; // валидация значения цифр
//            }
//        }
//        int[] sortArray = new SortArray().sortArray(arr); // Сортируем массив
//        int[][] copyArr = new int[arr.length][2];
//        int temp = 0;
//        for (int j = 0; j < sortArray.length; j++) {
//            int count = 1;
//            for (int i = 0; i < sortArray.length - 1; i++) { // Считаем и записываем пары неуникальных чисел
//                if (sortArray[i + 1] == sortArray[sortArray.length - 1]) {
//                    count++;
//                    break;
//                } else if (sortArray[i] == sortArray[i + 1] && sortArray[i + 1] != sortArray[sortArray.length - 1]) {
//                    count++;
//                    break;
//                }
//            }
//                if (count > 1) {
//                    copyArr[j][0] = temp;
//                    copyArr[j][1] = count;
//                    temp = sortArray[j+1];
//            }
//        }
//
//
//        return copyArr;
//    }




    /* В классе ManipulationsWithArrays написать метод createUniqueArray(), который принимает на вход
     * 2 массива int[] и возвращает объединенный массив уникальных неповторяющихся элементов
     */
    public int [] createDoubleUniqueArray (int[] arr1, int[] arr2){
        if ((arr1 == null || arr1.length == 0) && (arr2 == null || arr2.length == 0)) { // Валидация длины массива
            return new int[0];
        }

        int[] doubleArray = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++){
            doubleArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            doubleArray[arr1.length + i] = arr2[i];
        }
        int [] doubleUniqueArray = new CreateArray().createUniqueArray(doubleArray);
        return doubleUniqueArray;
    }

}
