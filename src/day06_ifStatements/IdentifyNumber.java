package day06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = -20;

        boolean isPositive = number > 0;
        boolean isNegative = !isPositive;
        boolean isZero = !isPositive && !isNegative;

        System.out.println(number + " is a positive number: " + isPositive);
        System.out.println(number + " is a negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);


    }
}
