package day06_ifStatements;

public class oddOrEven {

    public static void main(String[] args) {

        int number = 100;

        boolean isEven = number % 2 == 0; //When we divide a number by 2, if the remainder is 0, it means the number is even
        // boolean isOdd = number % 2 != 0;
        boolean isOdd = !isEven; // If the number is not even, then it is odd

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);



    }

}
