package day10_string;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        byte age = input.nextByte();

        System.out.println("Enter your gender: ");
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.println("Enter your company name: ");
        String company = input.nextLine();

        System.out.println("Enter your job title: ");
        String job = input.nextLine();

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.println("Employee's name = " + name);
        System.out.println("Employee's age = " + age);
        System.out.println("Employee's gender = " + gender);
        System.out.println("Company name = " + company);
        System.out.println("Employee's job title = " + job);
        System.out.println("Employee's salary = $" + salary);

        input.close();


    }
}
