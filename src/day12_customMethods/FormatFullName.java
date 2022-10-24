package day12_customMethods;

public class FormatFullName {

    public static void main(String[] args) {

        /*
        Write a program that asks user to enter first and last names,
        and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
         */

        String first = "cyDEo";
        String last = "SCHOOL";

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        // getting first character of first name + the remaining characters of the first name
                // "c"   ------> "C"

        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println(first);
        System.out.println(last);










    }
}
