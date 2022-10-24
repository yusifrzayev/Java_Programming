package day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(100 + 200);
        System.out.println(40 - 10);


        // in math 20 / 6 = 3.3333333
        // in java 20 / 6 = 3, because int / int ===> int value
        // but 20 / 6.0 = 3.333333.... because int / double


        System.out.println(50/6); //  int/int = int
        System.out.println(50/6.0); // int/double = double
        System.out.println(50.0/6); // double/int = double
        System.out.println(50d / 6); // when you give d or D, int will be converted to the double

        System.out.println(2.5 / 0.5); // double / double = double
        System.out.println((int)(2.5/0.5)); // use this to convert it to integer

        // System.out.println(9/0); // 9 / 0 also may not do in Java



        System.out.println(10*2);
        System.out.println(20*12);


        /* Module operator (%) is used for remainder:
           Remainder: numerator - (denominator * integer result)

           10/3 = 3.33333333
           remainder: 10 - (3*3) = 1

           20/6 = 3.333333
           remainder: 20 - (6*3) = 2

           15/4 = 3.75
           15 - (4*3) = 3

           10 % 3 ====> 1
           20 % 6 ====> 2
           15 % 4 ====> 3 */


        System.out.println( 100 % 13 );
        System.out.println( 45 % 8 );





    }

}
