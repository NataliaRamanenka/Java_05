package project_utils;

import java.util.Arrays;

public class Utils {

    public static void temperatureCtoF(double temp) {
        System.out.print("C° = " + temp + "\u2103\t\t");
        System.out.println("F° = " + ((temp * 9 / 5) + 32) + "\u2109");
    }

    public static int returnPositiveRandomNumber() {
        int number = (int) (Math.random() * 99) + 1;

        return number;
    }

    public static int returnNegativeRandomNumber() {
        int number = (int) (Math.random() * 99) - 99;

        return number;
    }

    public static void printSequenceOfEvenPositiveNumbers(int length) {
        if (length > 0) {
            for (int i = 0; length > 0; i += 2, length--) {
                System.out.print(i + ", ");
            }
            System.out.println();
        } else {
            System.out.println("Введите положительную длину последовательности");
        }
    }

    public static int[] printSequenceOfOddNumbers(int start, int end, int step) {
        if (step != 0) {
            if (start < end && step > 0) {
                int j = 0;
                int l = (int) Math.round((end - start) / (double) step);
                int[] arrNegOdds = new int[l];
                for (int i = (start + 1 - Math.abs(start % 2)); i < end; i += step, j++) {
                    arrNegOdds[j] = i;
                }
                System.out.println(Arrays.toString(arrNegOdds));

                return arrNegOdds;

            } else if (start > end && step < 0) {
                int j = 0;
                int l = (int) Math.round((end - start) / (double) step);
                int[] arrNegOdds = new int[l];
                for (int i = (start - 1 + Math.abs(start % 2)); i > end; i += step, j++) {
                    arrNegOdds[j] = i;
                }
                System.out.println(Arrays.toString(arrNegOdds));

                return arrNegOdds;
            }
        }

        return new int[0];
    }

    public static void generateSequenceOfRandomNumb(double n, double m, int l) {
        if (l > 0) {
            for (double i = 1; i <= l; i++) {
                if (i == l) {
                    System.out.print((int) (Math.random() * (m - n + 1) + n));
                } else {
                    System.out.print((int) (Math.random() * (m - n + 1) + n) + ", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("неверная длина интервала");
        }
    }

    public static void printSequence(double start, double end, double step) {
        if (step != 0) {
            double first;
            if ((start > 0 && end > 0) || (start < 0 && end < 0)) {
                first = start + step - start % step;
            } else {
                first = start - start % step;
            }
            if (start >= end && step < 0) {
                for (double i = first; i >= end; i += step) {
                    System.out.print(i + ", ");
                }
            } else if (start <= end && step > 0) {
                for (double i = first; i <= end; i += step) {
                    System.out.print(i + ", ");
                }
            } else {
                System.out.print("Введите корректный шаг");
            }
        } else {
            System.out.print("Внимание!Зацикливание!");
        }
        System.out.println();
    }

    public static void printRandomIntNumber(int l, int minValue, int maxValue) {
        if (l > 0) {
            int[] randomArray = new int[l];
            for (int i = 0; i < l; i++) {
                randomArray[i] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
                System.out.println(Arrays.toString(randomArray));
            }
        } else if (l == 0) {
            System.out.println("Длина последовательности равна нулю");
        } else {
            System.out.println("Введите положительную длину последовательности");
        }
    }

    public static int returnDayOfTheWeek(String day) {

        switch (day.toLowerCase()) {
            case "mon":
                return 1;
            case "tue":
                return 2;
            case "wed":
                return 3;
            case "thu":
                return 4;
            case "fri":
                return 5;
            case "sat":
                return 6;
            case "sun":
                return 7;
        }

        return 0;
    }

    public static String returnNameOfDayOfTheWeek(int dayName) {

        switch (dayName) {
            case 1:
                return "Mon";
            case 2:
                return "Tue";
            case 3:
                return "Wed";
            case 4:
                return "Thu";
            case 5:
                return "Fri";
            case 6:
                return "Sat";
            case 7:
                return "Sun";
        }
        return "Error";
    }

    public static int returnMonth(String month) {

        switch (month.toLowerCase()) {
            case "jan":
                return 1;
            case "feb":
                return 2;
            case "mar":
                return 3;
            case "apr":
                return 4;
            case "may":
                return 5;
            case "jun":
                return 6;
            case "jul":
                return 7;
            case "aug":
                return 8;
            case "sep":
                return 9;
            case "oct":
                return 10;
            case "nov":
                return 11;
            case "dec":
                return 12;
        }

        return 0;
    }

    public static String returnNameOfMonth(int month) {

        switch (month) {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";
        }

        return "Error";
    }

    public static int returnDate(int date) {
        if (date < 10) {
            String number = String.format("%03d", date);

            return Integer.valueOf(number); //добавляем ноль для 1-9
        } else {
            return date;
        }
    }

    public static int daysInMonth(int month, int year) {

        int numDays;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:

                return -1;
        }

        return numDays;
    }

    public static void printEightDaysFromDate(String day, int month, int date, int year, int l) {

        if (returnDayOfTheWeek(day) == 0 ||
                returnNameOfMonth(month).equals("Error") ||
                date <= 0 ||
                date > (daysInMonth(month, year))) {

            System.out.println("Please enter correct data.");

        } else {
            int currentDay = returnDayOfTheWeek(day);
            int currentMonth = month;
            int currentDate = date;
            int currentYear = year; //использовал для метода без агумета year. Для текущего года.

// print day
            for (int i = 0; i < l; i++) {
                if (currentDay != 7) {
                    System.out.print(returnNameOfDayOfTheWeek(currentDay) + ", ");
                    currentDay++;
                } else {
                    System.out.print(returnNameOfDayOfTheWeek(currentDay) + ", ");
                    currentDay = 1;
                }
// print month + date
                if (currentDate <= daysInMonth(currentMonth, currentYear)) {
                    System.out.println(returnNameOfMonth(currentMonth) + " " + returnDate(currentDate));
                    currentDate++;
                } else {
                    if (currentMonth != 12) {
                        currentMonth++;
                    } else {
                        currentMonth = 1;
                        currentYear = year + 1;
                    }
                    currentDate = 1;
                    System.out.println(returnNameOfMonth(currentMonth) + " " + returnDate(currentDate));
                    currentDate++;
                }
            }
        }
    }

    public boolean isDigit(char c) {

        return c >= '0' && c <= '9';
    }

    public boolean isDigitInString(String str) {
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {

                    return true;
                }
            }
        }

        return false;
    }

    public boolean isOnlyDigitsInString(String str) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {

                return false;
            }
        }

        return true;
    }

    public boolean isDotOrComma(char c) {

        return (c == ',' || c == '.');
    }

    public boolean isDotBetweenDigits(String str, int index) {

        return ((index > 0) && (index < str.length() - 1)
                && isDotOrComma(str.charAt(index))
                && isDigit(str.charAt(index - 1))
                && (isDigit(str.charAt(index + 1))));
    }

    public boolean isNegativeNumber(String str, int index) {

        return index < str.length() - 1
                && str.charAt(index) == '-'
                && isDigit(str.charAt(index + 1));
    }

    public boolean isIntCanStoreValue(String str) {
        if (str.length() <= 10) {

            return Long.parseLong(str) <= Integer.MAX_VALUE;
        }

        return false;
    }

    public boolean arrayContainsNumber(int[]array, int number){
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                found = true;
                return found;
            }
        }
        return found;
    }



}
