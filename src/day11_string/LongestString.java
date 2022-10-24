package day11_string;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings: ");

        String s1 = input.nextLine();
        String s2 = input.nextLine();


        if (s1.length() > s2.length()){
            System.out.println("first string is the longest");
        } else if(s2.length() > s1.length()){
            System.out.println("second string is the longest");
        }else{
            System.out.println("Equal");
        }

        input.close();

    }
}
