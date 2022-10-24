package day10_string;

import java.util.Scanner;

public class StringMethods1 {

    public static void main(String[] args) {

        String str = "Cydeo";
        //index:     01234

        char firstChar = str.charAt(0); // it will print the first index number of String
        char secondChar = str.charAt(1); // it wil print the second index number of String
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        //  char sixthChar = str.charAt(5); // this index number doesn't exist, so it will give a compile error
        // char nChar = str.charAt(-25); // compile error, because the index number can not be less than 0

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);


        System.out.println("---------------------------------------------------------------------------------");

        String sentence = "Java Programming Language";

        int length = sentence.length(); // to calculate the amount of index numbers in String

        System.out.println(length); // prints the amount of index numbers

        int lastIndex = length - 1; // to find the last index number

        System.out.println(lastIndex);


        System.out.println("---------------------------------------------------------------------------------");


        String s1 = "Java is the best programming language";

        char f = s1.charAt(0);

        int lastIndexNum = s1.length() - 1;

        char l = s1.charAt(lastIndexNum);

        System.out.println(f + " : " + l);


        System.out.println("---------------------------------------------------------------------------------");

        String name1 = "Joseph";
        String name2 = new String("Joseph");

        System.out.println(name1 == name2); // false

        // using equals() method:
        System.out.println(name1.equals(name2)); // true, even those are two different objects, the value is same


        System.out.println("---------------------------------------------------------------------------------");

        String r1 = "Java";
        String r2 = "Java";

        String r3 = new String("Java");

        System.out.println(r1 == r2); // true
        System.out.println(r1 == r3); // false
        System.out.println(r2 == r3); // false


        System.out.println(r1.equals(r3)); // true, because the value is the same
        System.out.println(r2.equals(r3)); // true


        System.out.println("---------------------------------------------------------------------------------");

        Scanner input = new Scanner(System.in);


        System.out.println("How old are you? ");
        int age = input.nextInt();


        System.out.println("Are you US citizen? yes/no ");
        String answer = input.next();

        if (age >= 21 && answer.equals("yes")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        } // the outcome will be not eligible anyway, if you use == "yes", because the "yes" and yes value are not same
        // that is why, we should use equals() method

        input.close();


    }
}
