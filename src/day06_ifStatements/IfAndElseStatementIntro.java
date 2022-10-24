package day06_ifStatements;

public class IfAndElseStatementIntro {

    public static void main(String[] args) {

        int age = 21;
        if (age >= 21){
            System.out.println("Eligible");
        }

        if (age < 21) {
            System.out.println("Not Eligible");
        }

        System.out.println("--------------------------------------------------------------------------------");

        if (age >= 21){
            System.out.println("Eligible");
        }else{ // otherwise, means if age is not >= 21, it is otherwise
            System.out.println("Not Eligible");
        }

        // Both of them have the same outcome, but is preferred to use if...else











    }
}
