public class IsPositiveNumber {

    /* Напишите алгоритм IsPositiveNumber, который возвращает true, если численный
     * параметр больше или равен нулю, и возвращает false, если параметр меньше 0.
     */
    public boolean isPositiveNumber(int number) {
        boolean result = true;
        if (number >= 0) {
            return result;
        } else {
            return !result;
        }
    }
}
