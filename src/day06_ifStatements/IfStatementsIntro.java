package day06_ifStatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        int number = -50;
        boolean isPositive = number > 0;

        if (isPositive) {
            System.out.println(number + " is positive.");}


        boolean isNegative = number < 0;
        if (isNegative) {
            System.out.println(number + " is negative.");}


        boolean isZero = number == 0;
        if (isZero) {
            System.out.println(number + " is zero.");}


        // At the end it will print one of three statements, depending on the number and on condition (positive, negative, zero)


        System.out.println("--------------------------------------------------------------------------------------");

        int num = 100;
        if (num > 0){
            System.out.println(num + " is positive number.");}

        if (num < 0){
            System.out.println(num + " is negative number.");}

        if (num == 0){
            System.out.println(num + " is zero.");}


        // At the end it will print one of three statements, depending on the number and on condition (positive, negative, zero)


    }
}