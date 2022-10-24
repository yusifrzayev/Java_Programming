package day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int a = 20;

        System.out.println(a); //20

        System.out.println(a); //20

        a = 40;

        System.out.println(a); //40
        //before line 13 a will be 20, but on line 13 we updated our variable, so it changes its value

        System.out.println("------------------------------------------------------------------------------------");


        int balance = 100;
        //addition assignment operator


        balance += 1000;  // balance = 100 + 1000
        System.out.println("balance = " + balance);


        balance += 500; // balance = 1100 + 500
        System.out.println("balance = " + balance);


        balance += 10000; // balance = 1600 + 10000
        System.out.println("balance = " + balance);


        System.out.println("------------------------------------------------------------------------------------");
        //subtraction assignment operator


        balance -= 1000; // balance = 11600 - 1000 = 10600
        System.out.println("balance = " + balance);


        balance -= 5000;
        System.out.println("balance = " + balance);


        System.out.println("------------------------------------------------------------------------------------");
        //multiplication assignment operator


        double salary = 45000;
        salary *= 2; // salary = 45000 * 2
        System.out.println("salary = " + salary);


        salary *= 3; // salary = 90000*3
        System.out.println("salary = " + salary);


        System.out.println("------------------------------------------------------------------------------------");
        //division assignment operator


        salary /= 2;
        System.out.println("salary = " + salary);



        System.out.println("------------------------------------------------------------------------------------");
        //remainder assignment operator

        int b = 39;
        b%=7; // b = 39 % 7, it will show the remainder of 39/7
        System.out.println("b = " + b);





    }

}
