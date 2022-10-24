package day06_ifStatements;

/*
1. Create a class named MaximumNumber.java
2. Declare the following variables:
1. num1
2. num2
3. Write a program that can print the maximum number between the
two numbers above, if both are equal then print Equal
 */

public class MaximumNumber {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 100;

        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number.");
        }

        if (num2 > num1) {
            System.out.println(num2 + " is the maximum number");
        }

        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        }

    }

}
