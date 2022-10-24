package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Enter + Enter

        System.out.println("Enter your full name: ");
        String full_name = input.nextLine(); // Joseph Rzayev


        System.out.println("Enter you school name: ");
        String school_name = input.nextLine(); // Cydeo School

        System.out.println("Enter your gender: ");
        String gender = input.next(); // male

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 22

        input.nextLine(); // we use it to clean the scanner

        System.out.println("Enter your street name: ");
        String street = input.nextLine();

    }
}
