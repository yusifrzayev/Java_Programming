package day03_variables;

public class PrimitiveDataTypesIntro2 {

    public static void main(String [] args){

        //DataType variableName = Data;

        char a = '@';
        // char used ONLY for SINGLE character
        // to give a single character you must type it in ''
        // single character can be everything you want
        char b = '!';

        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------------------------------------------");

        char ch1 = 'A';
        char ch2 = 65;

        // even char is single character, you can use ascii table, and it should be in char range (0 to 65335)

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println("----------------------------------------------------");

        char ch3 = 9000;
        System.out.println(ch3);

        char ch4 = 40000;
        System.out.println(ch4);
        System.out.println("----------------------------------------------------");

        int sum = 'A' + 'B';
        //A number is 65, B is 66 -> 65+66 = 131
        System.out.println(sum); //131

        System.out.println("----------------------------------------------------");


        // boolean r1 = 123;
        // boolean r2 = 2.5;
        // boolean r3 = "Java";

        // -> Boolean is used for true or false

        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; // Because 100 > 10, this expression is true
        boolean r7 = 0 < -1; // Because 0 is not smaller than -1 it is false

        System.out.println(r6);
        System.out.println(r7);

        /*
        1. We use char for single character ''
        2. We use boolean for true or false

        3. DataType variableName = Data
         */








    }
}
