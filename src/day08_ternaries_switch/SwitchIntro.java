package day08_ternaries_switch;

public class SwitchIntro {

    public static void main(String[] args) {

      /*
      A: "Excellent"
      B: "Great job"
      C: "Good"
      D: "Passed"
      F: "Failed"
      */

         /*char grade = 'B';

        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else {
            result = "Failed";
        }

        System.out.println(result);

        System.out.println("----------------------------------------------------------------------------"); */

        char grade = 'Q';

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");

                // You should always give a break statement at the end of each case or default
                // but it is optional for the last statement

        }


    }
}
