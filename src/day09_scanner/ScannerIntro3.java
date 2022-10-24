package day09_scanner;


import java.util.Scanner;

public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0); // we use this method to use char on scanner

        System.out.println("You have entered: " + ch);

        System.out.println("Would you like to continue?");

        // String answer = input.next(); // we use next() method only for one word texts, because it reads till space

        String answer = input.nextLine(); // we use nextLine() method for text with more than one word

        System.out.println("You have entered: " + answer);

        input.close();
    }
}
