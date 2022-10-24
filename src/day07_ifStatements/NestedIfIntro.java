package day07_ifStatements;

import java.sql.SQLOutput;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = -300;


        if (score >= 0 && score <= 100) {           // We give our pre-condition, to make score valid

            if (score >= 60) {
                System.out.println("Passed");       // if the score is greater or equal to 60
            } else {
                System.out.println("Failed");       // if the score is less than 60, the opposite of "Passed"
            }
        } else {                                    // if the score is not valid, not in the range of our pre-condition
            System.out.println("Invalid Score");
        }

        // This is a nested if statement, to give pre-condition for valid score


        System.out.println("-----------------------------------------------------------------------------");

        int age = 8;

        String result = "";

        if (age >= 1 && age <= 150) {
            if (age >= 21) {
                result = "Eligible";
            } else {
                result = "Not eligible";
            }
        } else {
            result = "Invalid age";
        }

        System.out.println(result);


        System.out.println("-----------------------------------------------------------------------------");

        int day = 5;

        String results = "";

        if (day >= 1 && day <= 7) {
            if (day == 1) {
                results = "Monday";
            } else if (day == 2) {
                results = "Tuesday";
            } else if (day == 3) {
                results = "Wednesday";
            } else if (day == 4) {
                results = "Thursday";
            } else if (day == 5) {
                results = "Friday";
            } else if (day == 6) {
                results = "Saturday";
            } else{
                results = "Sunday";
            }

        } else { // if the precondition is failed
            results = "Invalid day";
        }

        System.out.println(results);


    }
}
