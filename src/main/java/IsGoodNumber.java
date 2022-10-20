public class IsGoodNumber {
    public String isGoodNumber(int number){
        if (number % 7 == 0 && number % 9 == 0 ) {
            return "хорошее число";
        } else if (number % 9 == 0 ) {
            return "неверное число";
        } else if (number % 11 == 0 ) {
            return "плохое число";
        }
        return "-1";
    }
}
