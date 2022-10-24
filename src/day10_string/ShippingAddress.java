package day10_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String city = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.nextLine();

        System.out.println("Enter your zip code: ");
        String zip = input.next();

        System.out.println("Your shipping address is: " + fullName);
        System.out.println("\t\t" + buildingNumber + " " + streetName);
        System.out.println("\t\t" + city + ", " + state + " " + zip);

        input.close();


    }
}
