package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        // DataType variableName = Data;

        // byte a = "Java";  // The reason for error is, byte accepts ONLY integer values  (-128 to 127)
        // byte a = 20.5; // byte can not take decimal numbers
        // byte a = 2000; // out of Byte range (-128 to 127)
        byte a = 20;


        // price of the car is $17500

        short p = 17500;
        System.out.println(p);
        //If you want to use a variable, type it in print statement without double quote


        // salary is $95000
        int s = 95000; //preferred
        System.out.println(s);


        // int n = 99999999999;
        // the value is greater than the range

        //long n = 999999999999;
        // the compiler takes long as int, because int is preferred type with Integer numbers
        //If you want to use long you, add l or L at the end of data

        long n = 999999999999L;
        long n1 = 999999999999l;


        //decimal numbers
        //gpa is 3.5
        double gpa = 3.5;
        //double is a preferred data type for decimal numbers

       // float gpa2 = 3.5; you get error because 3.5 is in range of double

        float gpa2 = 3.5F; //if you add F or f at the end of data, it is going to be assigned as float data type

        /*
        Preferred Data Types are:
        1. For Integer - int
        2. For Decimal - double
         */






    }
}
