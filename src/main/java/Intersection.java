public class Intersection {
    /* Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
     * и возвращает массив общих элементов.
     */
    public int[] intersection(int[] array1, int[] array2) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    counter++;
                }
            }
        }
        int[] commonArray = new int[counter];

        for (int k = 0; k < counter;) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array2[j] == array1[i]) {
                        commonArray[k] = array2[j];
                        k++;
                    }
                }
            }
        }
        if (counter != 0) {

            return commonArray;
        } else {

            return new int[0];
        }
    }
}