public class MinMaxAve {
    /* Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
     * Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
     * и среднее среди всех значений между 2-мя индексами.
     */

    public double[] minMaxAve(int[] array, int index1, int index2) {
        if (index1 >= 0 && index2 >= 0 && index1 < (array.length - 1) && index2 < (array.length - 1)) {
            double[] resultArray = new double[3];
            double sum;
            if (index1 <= index2) {
                resultArray[0] = array[index1];
                resultArray[1] = array[index1];
                sum = array[index1];
                for (int i = (index1 + 1); i <= index2; i++) {
                    sum = sum + array[i];
                    resultArray[0] = Math.min(array[i], resultArray[0]);
                    resultArray[1] = Math.max(array[i], resultArray[0]);
                }
            } else {
                resultArray[0] = array[index2];
                resultArray[1] = array[index2];
                sum = array[index2];
                for (int i = (index2 + 1); i <= index1; i++) {
                    sum = sum + array[i];
                    resultArray[0] = Math.min(array[i], resultArray[0]);
                    resultArray[1] = Math.max(array[i], resultArray[0]);
                }
            }
            resultArray[2] = sum / (Math.abs(index2 - index1) + 1);

            return resultArray;

        }

        return new double[0];
    }
}
