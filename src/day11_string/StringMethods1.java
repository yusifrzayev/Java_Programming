package day11_string;

import java.util.logging.XMLFormatter;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

        str1.toLowerCase();    // it will convert all upper case letters to lower case letters -> "cydeo school"
        System.out.println(str1); // it still prints in uppercase, because you can't change a String object (immutable)



        str1 = str1.toLowerCase(); // we assigned str1, so it will print lowercase version
        System.out.println(str1); // prints lowercase version



        System.out.println("--------------------------------------------------------------------");

        String str2 = "java programming";
        str2.toUpperCase(); // still in lower case


        str2 = str2.toUpperCase(); // assigned to upper case => "JAVA PROGRAMMING"
        System.out.println(str2); // prints everything in upper case => "JAVA PROGRAMMING"



        System.out.println("--------------------------------------------------------------------");

        String word = "Wooden Spoon";


        word = word.toUpperCase(); // "WOODEN SPOON"

        word = word.toLowerCase(); // "wooden spoon"


        System.out.println(word); // wooden spoon, because last assignment is toLowerCase



        System.out.println("--------------------------------------------------------------------");

        String str4 = "                 Cydeo School";

        str4.trim();  // trim method helps us to clean wide spaces => "Cydeo School"

        str4 = str4.trim();

        System.out.println(str4);   //   "Cydeo School"



        System.out.println("--------------------------------------------------------------------");

        String sentence1 = "Today is Sunday, and we have Java Class";

        sentence1.indexOf('w'); // indexOf method helps to find the index number of the character

        int index1 = sentence1.indexOf('o'); // because index number is an integer number


        System.out.println(index1);


        String s1 = "I love Java Programming";

        // it checks from left to right, if there are same character, it will give us the first one's index
        int firstA = s1.indexOf('a'); // 8, because first a index is 8

        System.out.println(firstA);


        int secondA = s1.indexOf("a "); // you have to make second character unique, to make it possible to find,
        // use "", and use sequence of characters
        System.out.println(secondA);


        String s2 = "Java Python JavaScript Cydeo Python";


        int a1 = s2.indexOf('a');
        System.out.println(a1);

        int a2 = s2.indexOf("a "); // add space to make unique to find
        System.out.println(a2);

        int a3 = s2.indexOf("avaS"); // make it unique to find
        System.out.println(a3);

        int a4 = s2.indexOf("aS");
        System.out.println(a4);



        System.out.println("--------------------------------------------------------------------");

        // lastIndexOf() method is basically the same as IndexOf(), but it reads starting from right to left

        String stri1 = "Learning Java is very interesting";

        int stri = stri1.lastIndexOf("L");

        System.out.println(stri);



        System.out.println("--------------------------------------------------------------------");
        // indexOf()  &&  lastIndexOf()

        String w = "Java";
        w.indexOf('a');
        w.lastIndexOf('a');

        System.out.println(w.indexOf('a'));  // index == 1
        System.out.println(w.lastIndexOf('a'));   // index == 3


        String w2 = "Java Python JavaScript Cydeo Python";
        w2.lastIndexOf('a');
        w2.lastIndexOf('P');

        System.out.println(w2.lastIndexOf('a'));   // index == 15


        System.out.println(w2.lastIndexOf('P'));   // 29




































    }
}
