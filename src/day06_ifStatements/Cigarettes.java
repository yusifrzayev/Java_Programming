package day06_ifStatements;

public class Cigarettes {

    /*
    1. Create a class named Cigarettes.java
2. A variable named age is declared and given, Write a program that
can check if the person is eligible to buy cigarettes
   */

    public static void main(String[] args) {

        int age = 21;
        boolean eligible = age >= 21;

        if (eligible) {
            System.out.println("You are eligible to buy cigarettes.");
        }

        if (!eligible) {
            System.out.println("You are not eligible to buy cigarettes.");
        }

        System.out.println("-----------------------------------------------------------------------------------");

        age = 15;
        boolean  eligible1 = age >= 21;
        boolean notEligible = age < 21;

        if (eligible1){
            System.out.println("You are eligible to buy cigarettes.");
        }

        if (notEligible){
            System.out.println("You are not eligible to  buy cigarettes.");
        }


        System.out.println("-----------------------------------------------------------------------------------");


        age = 47;
        if (age >= 21) {
            System.out.println("You are eligible to buy cigarettes.");
        }

        if (age < 21) {
            System.out.println("You are not eligible to buy cigarettes.");
        }


        // All of these are different ways to solve the task



    }

}
