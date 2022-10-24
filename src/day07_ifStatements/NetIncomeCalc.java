package day07_ifStatements;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary = 100000;
        boolean isMarried = false;


        double taxRate = 0;

        if (salary >= 130000) {
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary <= 129000) {
            taxRate = 0.3;
        }
        if (salary >= 80000 && salary <= 99000) {
            taxRate = 0.25;
        }
        if (salary <= 79000){
            taxRate = 0.2;
        }
        if (isMarried){              // if the person is married
            taxRate -= 0.05;         // tax is reduced by 5%
        }


        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;


        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

    }
}
