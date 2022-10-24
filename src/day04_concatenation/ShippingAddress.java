package day04_concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Aaron Kissinger ",
                buildingNumber = "13621A ",
                streetName = "Legacy Circle ",
                city = "Fairfax, ",
                state = "VA ";
        int zipCode = 22030;


        System.out.println("Your Shipping address is: ");
        System.out.println(name + buildingNumber);
        System.out.println(streetName + city + state + zipCode);

        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Your shipping address is: \n\t" + name + "\n\t" + buildingNumber + streetName + "\n\t" + city + state + zipCode);



    }

    /*
   Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
Aaron Kissinger
13621A Legacy Circle
Fairfax, VA 22030

         */

}
