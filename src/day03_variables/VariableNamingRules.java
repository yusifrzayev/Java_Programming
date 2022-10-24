package day03_variables;

public class VariableNamingRules {
    /* Variable naming rules:
       1. Readable, understandable, and meaningful
       2. Must be UNIQUE
       3. If variable name contains many words, you should apply camelCase
       4. You can also use underscore besides camelCase
       5. No special characters other than _ and $
       6. You can use digits, but variable Name can not start with it
       7. Variable Name can not be Java reserved words */

    public static void main(String[] args){

        // age of the student is 28
        // the salary is 10000$

        int age = 28;
        int salary = 10000;

        System.out.println(age);
        System.out.println(salary);

        // int age = 32; // you have error, because variable name must be unique

       // int phone number = 123456789; // Use camelCase

        int phoneNumber = 12345689;

        System.out.println(phoneNumber);

        double salaryBeforeTax = 100000.5;

        double salary_after_tax$ = 80000.5;

        System.out.println("--------------------------------------------");

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        // double abstract = 5.5
        // variable name can not be Java reserved words

        // gender is male
        //We use String for texts
        String gender = "Male";

        String fullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);



    }
}
