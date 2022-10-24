package day09_scanner;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        /* import statement - used for importing one java file to another one
         1 - regular import: imports one single class from the specified package
         import package.className;

         2 - wild import: imports everything from the package
         import package.*;
         */


         Scanner input = new Scanner(System.in);    // for reading user inputs

        System.out.println("Enter your first number");

        byte num1 = input.nextByte();

        System.out.println("Enter your second number");

        short num2 = input.nextShort();

        System.out.println("Enter your third number");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number");

        long num4 = input.nextLong();

        input.close(); // it means scanner is closed, can not read user inputs again


        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2);
        System.out.println("Third number is: " + num3);
        System.out.println("Fourth number is: " + num4);










    }
}
