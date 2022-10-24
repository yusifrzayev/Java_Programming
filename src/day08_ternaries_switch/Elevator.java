package day08_ternaries_switch;

public class Elevator {

    public static void main(String[] args) {

        int number = 1;

        if (number == 1 || number == 2 || number == 3){
            if (number==1){
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks ");
            } else if (number == 2){
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            } else{
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
        } else{
            System.out.println("Invalid floor");
        }






















    }
}
