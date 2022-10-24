package day11_string;

public class StringMethods3 {

    public static void main(String[] args) {

        // isEmpty() method
        // if String is empty -> true, if not -> false

        String word = "Java";
        boolean r1 = word.isEmpty(); // assign to boolean, to check true or false

        System.out.println(r1); // false, because String word is not empty


        String word2 = "";
        boolean r2 = word2.isEmpty();

        System.out.println(r2); // true, because word2 is empty



        System.out.println("---------------------------------------------------------------------------");
        // isBlank() method
        // if String contains only spaces -> true, if empty or has characters -> false

        String str = "        ";

        boolean r3 = str.isEmpty();
        boolean r4 = str.isBlank();

        System.out.println(r3); // false, because it is not empty, has spaces
        System.out.println(r4); // true, because has only spaces



        System.out.println("---------------------------------------------------------------------------");
        // equals() method
        // use to compare two objects with same characters -> true or false
        // is case-sensitive (Upper case, lower case)

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");
        // they are not same objects, but have same value and characters

        System.out.println(str1 == str2);   // false
        System.out.println(str1.equals(str2));  // true


        String str3 = new String("cydeo");
        System.out.println(str1.equals(str3));  // false, because of case-sensitivity



        System.out.println("---------------------------------------------------------------------------");
        // equalsIgnoreCase() method
        // is similar with equals() method, BUT IS NOT case-sensitive

        String str4 = "JAVA";
        String str5 = "java";

        System.out.println(str4.equalsIgnoreCase(str5));    // true, because equalsIgnoreCase is not case-sensitive



        System.out.println("---------------------------------------------------------------------------");
        // contains() method
        // checks if the given String is contained in the String -> true or false
        // is case-sensitive

        String students = "Joseph John Mary Sam";
        boolean hasDan = students.contains("Dan");    // false, because Dan is not included

        System.out.println(hasDan);  // false


        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");    // we use to lowerCase to avoid case-sensitivity

        System.out.println("hasJava = " + hasJava);   // true



        System.out.println("---------------------------------------------------------------------------");
        // startsWith() method
        // checks if the string is started with given str -> true or false

        String name = "Michael";
        boolean l = name.startsWith("Da"); //   false

        System.out.println(l);  // false


        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www.");   // true

        System.out.println(isValid);    // true



        System.out.println("---------------------------------------------------------------------------");
        // endsWith() method
        // checks if the string is ended with given str -> true or false

        String url2 = "www.cybertek.com";
        boolean isValid2 = url2.endsWith(".com");   // true

        System.out.println(isValid2);   // true


        String email = "CydeoSchool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");


        System.out.println("isGmail = " + isGmail); // true
        System.out.println("isYahoo = " + isYahoo); // false
        System.out.println("isHotmail = " + isHotmail); // false


    }
}
