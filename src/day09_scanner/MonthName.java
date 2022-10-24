package day09_scanner;

import java.util.Scanner;

public class MonthName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int monthName = input.nextInt();

        String month = (monthName >=1 && monthName <=12)?
                (monthName == 1)? "January" :(monthName == 2)? "February" :(monthName == 3)? "March"
                        :(monthName == 4)? "April" :(monthName == 5)? "May" :(monthName == 6)? "June"
                        :(monthName == 7)? "July" :(monthName == 8)? "August" :(monthName == 9)?
                        "September" :(monthName == 10)? "October" :(monthName == 11)? "November"
                        : "December" : "Invalid number";

        System.out.println(month);

        input.close();










    }
}
