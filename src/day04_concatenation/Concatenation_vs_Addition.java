package day04_concatenation;

public class Concatenation_vs_Addition {

    public static void main(String[] args) {

        // + is used for two cases: concatenation and addition

        // CONCATENATION
        // for concatenation we MUST use String

        System.out.println("32" + 1); //Result -> 321, because "32" is text/String

        System.out.println(7 + "1"); //Result -> 71, because "1" is text/String

        System.out.println("13" + "2"); //Result -> 132 because "13" "2" are text/String

        System.out.println("---------------------------------------------------------------------------");

        //ADDITION
        System.out.println(12 + 2.5); //14.5 because it is addition

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("The value is " + true);









    }


}
