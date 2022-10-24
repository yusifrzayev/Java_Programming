package day03_variables;

public class StudentInfo {

    /*
    1. Create a class named StudentInfo.java
    2. Declare the following variables with appropriate data types:
      1. students_name
      2. age
      3. gender
      4. school_name
      5. student_id
      6. grade_level
      7. gpa

     */

    public static void main(String[] args) {

        String students_name = "Memmedaga";
        byte age = 31;
        char gender = 'M';
        String school_name = "Azerbaycan Diller Universiteti";
        double student_ID = 3169.5;
        byte grade_level = 5;
        double gpa = 3.5;
        boolean isFullTime = true;

        System.out.println("students_name = " + students_name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_name = " + school_name);
        System.out.println("student_ID = " + student_ID);
        System.out.println("grade_level = " + grade_level);
        System.out.println("gpa = " + gpa);
        System.out.println("isFullTime = " + isFullTime);


    }
}
