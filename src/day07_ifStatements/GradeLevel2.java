package day07_ifStatements;

public class GradeLevel2 {
    public static void main(String[] args) {

        int gradeLevel = 17; // 1 ~ 18

        String result = "";

        if (gradeLevel <= 5){       // false: gradeLevel >= 6
            result = "Elementary School";
        }else if(gradeLevel <= 8){      // false: gradeLevel >= 9
            result = "Middle School";
        }else if(gradeLevel <= 12){     // false: gradeLevel >= 13
            result = "High School";
        }else if(gradeLevel <= 16){     // false: gradeLevel >= 17
            result = "College";
        }else{
            result = "Grad School";
        }

        System.out.println(result);








    }
}
