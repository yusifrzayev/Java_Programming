package day05_operators;

import java.sql.SQLOutput;

public class RelationalOperators2 {

    public static void main(String[] args) {

        // == equal relational operator

        System.out.println(1000 == 2000); // false

        System.out.println("Java" == "Java"); // true
        System.out.println("java" == "JAVA"); // false
        System.out.println("Muhtar" == "Good Guy"); // false
        // We can use equal operator for String

        System.out.println( true == false);
        // We can use equal operator for boolean


        System.out.println("--------------------------------------------------------------------");
        // != not equal relational operator

        System.out.println(1000 != 2000); // true

        System.out.println("Java" != "Java"); // false
        System.out.println("java" != "JAVA"); // true
        System.out.println("Muhtar" != "Good Guy"); // true
        // We can use equal operator for String


        System.out.println( true != false); // true
        // We can use equal operator for boolean




    }




}
