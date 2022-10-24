package day11_string;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the username & password: ");

        String username = input.nextLine();
        String password = input.nextLine();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("You are now logged in");
        } else {
            System.err.println("Incorrect username or password. Please try again");
        }

        input.close();


    }
}
