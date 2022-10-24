package day07_ifStatements;

public class LoanApplication {

    public static void main(String[] args) {

        int salary = 48000;
        int creditScore = 70;

        String result = "";

        if (salary >= 45000 && creditScore >= 700) {
            result = ("Eligible");
        } else {
            result = ("Not eligible");
        }

        System.out.println(result);


    }
}
