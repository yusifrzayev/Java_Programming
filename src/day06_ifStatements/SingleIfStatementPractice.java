package day06_ifStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 155;
        boolean isEven = number % 2 == 0;


        if (isEven) {
            System.out.println(number + " is an even number.");
        }

        if (!isEven){
            System.out.println(number + " is an odd number.");
        }

        System.out.println("------------------------------------------------------------------------");

        if (number % 2 == 0){
            System.out.println("is even.");
        }

        if(number % 2 != 0){
            System.out.println("is odd");
        }










    }


}
