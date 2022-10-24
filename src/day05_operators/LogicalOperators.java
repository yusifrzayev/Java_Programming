package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {


        // Logical AND operator &&

        double salary = 60000;
        int creditScore = 650;
        int age = 25;


        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;
        System.out.println(eligibleForLoan); //true


        double salary1 = 90000;
        int creditScore1 = 500;
        int age1 = 25;

        boolean eligibleForLoan1 = salary1 >= 30000 && creditScore1 >= 650 && age1 >= 18;
        System.out.println(eligibleForLoan1); //false

        System.out.println("--------------------------------------------------------------------------------");

        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";
        System.out.println(eligibleToVote); // true


        String country1 = "Japan";
        boolean eligibleToVote1 = age >= 18 && country1 == "USA";
        System.out.println(eligibleToVote1); // false

        System.out.println("--------------------------------------------------------------------------------");
        // || logical OR operator


        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer); //false


        String answer1 = "yes";
        boolean validAnswer1 = answer1 == "yes" || answer1 == "no";
        System.out.println(validAnswer1); //true

        System.out.println("--------------------------------------------------------------------------------");

        char grade = 'B';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println(passedTheExam); //true

        System.out.println("--------------------------------------------------------------------------------");
        // ! logical NOT operator

        System.out.println(true); //true
        System.out.println(!true); //false

        String a = "yes";
        boolean yes = a == "yes"; //true
        boolean no = !yes; //false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("--------------------------------------------------------------------------------");
        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println( true == !false && false == !true && true != !true); //true





    }


}
