package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        System.out.println("Enter the word: ");

        String str = new Scanner(System.in).nextLine();


        if(str.length() >= 1){ // if the string has at least one character

            char f = str.charAt(0); // the first of string

            if (f >= '0' && f <= '9'){
                System.out.println("First character is digit");
            }else if (f >= 'A' && f <= 'Z'){
                System.out.println("First character is uppercase letter");
            }else if (f >= 'a' && f <= 'z'){
                System.out.println("First character is lowercase letter");
            }else{
                System.out.println("First character is special character");
            }}else{ // if string is empty

            System.out.println("String is empty");
        }






    }
}