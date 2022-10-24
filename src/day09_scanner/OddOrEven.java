package day09_scanner;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");

        double num = input.nextDouble();

        boolean Odd = num % 2 != 0;
        boolean Even = num % 2 == 0;

        if (Odd) {
            System.out.println("The number is odd");
        } else if (Even) {
            System.out.println("The number is even");
        }
        input.close();

    }
}