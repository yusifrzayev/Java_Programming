package day05_operators;

public class RelationalOperators {

    public static void main(String[ ] args){
        //greater than operator    >

        int a = 1000;
        int b = 200;
        System.out.println( a > b );   //true


        /*  int a1 = 200;
        int b1 = 1000;
        System.out.println( a1>b1 );   //false */

        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);

        System.out.println("--------------------------------------------------------------------");
        //greater than or equal operator    >=

        int score = 75;
        boolean passed = score >= 60;
        System.out.println(passed);     //true

        int age = 21;
        boolean eligibleToBuyAlcohol = age >= 21;
        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;
        System.out.println(eligibleToVote);

        System.out.println("--------------------------------------------------------------------");
        //less than operator       <

        score  = 48;

        boolean failed = score < 60;
        System.out.println(failed);

        System.out.println("--------------------------------------------------------------------");

        System.out.println(100 < 2000); // true
        System.out.println(100 < 20); // false

        System.out.println("--------------------------------------------------------------------");
        //less than or equal operator       <=

        System.out.println(95 <= 100); // true
        System.out.println(100 <= 100); // true

        System.out.println(10 <= 5); // false


        System.out.println("--------------------------------------------------------------------");
        System.out.println( 'a' > 'b');
        //                  65  >  66 ASCII Table values

        // System.out.println("Java" <= "C#"); // you will an error, because relational operator are applicable only for numbers














    }


}
