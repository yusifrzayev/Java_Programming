package day09_scanner;

public class CrewAndPassengers1 {

    public static void main(String[] args) {

        int n = 50;

        String people = (n == 50 || n == 75 || n == 100)?
                (n == 50)? "20 crew, 30 passengers"
                        :(n == 75)? "25 crew, 50 passenger"
                        : "30 crew, 70 passengers"
                :"Invalid";

        System.out.println(people);

        System.out.println("----------------------------------------------------------------");

        int num = 100;

        String result = "";

        switch (num){

            case 50:
                result = "20 crew, 30 passengers";
                break;

            case 75:
                result = "25 crew, 50 passengers";
                break;

            case 100:
                result = "30 crew, and 70 passenger";
                break;

            default:
                result = "Invalid";
        }

        System.out.println(result);















    }
}
