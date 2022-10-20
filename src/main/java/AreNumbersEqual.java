public class AreNumbersEqual {
    /* Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
     * 0, если числа равны
     * -1, если первое число меньше второго
     * 1, если первое число больше второго
     */
    public int areNumbersEqual(int number1, int number2) {
        int result;
        if (number1 == number2) {
            result = 0;
        } else if (number1 < number2) {
            result = -1;
        } else {
            result = 1;
        }
        return result;
    }
}
