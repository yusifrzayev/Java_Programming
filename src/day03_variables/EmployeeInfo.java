package day03_variables;

        /*
        1. Create a class named EmployeeInfo.java
       2. Declare the following variables with appropriate data types:
       1. name
       2. age
       3. gender
       4. companyName
       5. employeeId
       6. jobTitle
       7. salary
       8. isFullTime  */

public class EmployeeInfo {

    public static void main(String[] args){

        String name = "Joseph";
        int age = 22;
        char gender = 'M';
        String companyName = "Google LLC",
           employeeId = "123456789987654321l",
            jobTitle = "CEO";
        double salary$ = 120000.5;
        boolean isFullTime = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(salary$);
        System.out.println(isFullTime);

        System.out.println("-------------------------------------");

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary$ = " + salary$);
        System.out.println("isFullTime = " + isFullTime);



    }
}
