package day10_string;

import java.util.Scanner;

 /* import java.lang.String;
 import java.lang.System; */ // compiler imports it automatically

public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println();

        input.close();

        System.out.println("--------------------------------------------------------------");

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";
        String s4 = "Cat";

        // even we have here 4 string objects, we have only 2 objects in the pool. Compiler refers to the existing one

        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); //true
        System.out.println(s3 == s4); //true

        //Because all these objects are same, and only one will be saved in the Heap -> pool


        System.out.println("--------------------------------------------------------------");

        String str1 = new String("Java"); // if we use new, it will create new objects: one is in the String pool
        // and the second on is in heap (outside String)

        String str2 = new String("Java");

        System.out.println(str1 == str2); // false, because these are two different objects


        System.out.println("--------------------------------------------------------------");

        String t1 = "Python";
        String t2 = new String("Python");
        String t3 = new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);


        System.out.println(t1 == t2); // false
        System.out.println(t2 == t3); // false, even t2 and t3 are outside the pool, there are new objects and are not the same


    }
}
