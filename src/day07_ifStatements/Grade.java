package day07_ifStatements;

public class Grade {

    public static void main(String[] args) {

        char grade = 'A';
        String result = "";


        if (grade == 'A') {
            result = ("excellent");
        }
        if (grade == 'B') {
            result = ("great job");
        }
        if (grade == 'C') {
            result = ("good");
        }
        if (grade == 'D') {
            result = ("passed");
        }
        if (grade == 'F') {
            result = ("failed");
        }

        System.out.println(result);

    }
}
