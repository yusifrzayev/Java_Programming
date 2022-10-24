package day11_string;

import java.io.FilterOutputStream;

public class StringMethods2 {

    public static void main(String[] args) {

        // replace() method
        // it replaces ALL matching char sequences with char sequences, that you give

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");     // it replaces Python with Java in new String

        System.out.println(sentence);    // Python, because String is immutable, if you don't assign sentence to method



        String word = "java";
        word = word.replace("a","e");
        System.out.println(word);       // jeve, because word is assigned to replace() method



        System.out.println("-------------------------------------------------------------------------------------");
        // replaceFirst() method
        // it replaces the FIRST matching char with given new value


        String sentence2 = "I love Java, Java is cool";
        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2);      // I love Python, Java is cool -> it replaces FIRST Java with Python


        String sentence3 = "Java is fun, Java is cool, Java is amazing"; // replace second Java with Python
        sentence3 = sentence3.replaceFirst(", Java", ", Python"); // make it unique to replace

        System.out.println(sentence3);  // Java is fun, Python is cool, Java is amazing



        System.out.println("-------------------------------------------------------------------------------------");
        // substring() method
        // substring(beginningIndex, endingIndex) - ending index is excluded
        // creates substring starting from the given beginning index till the given ending index

        String sentence4 = "I love Java Programming";
        int index = sentence4.indexOf("J");
        int index2 = sentence4.lastIndexOf("a ");

        System.out.println(index); // index number is 7
        System.out.println(index2); // index number is 10

        String sub = sentence4.substring(7, 10+1);   // we add +1, because last index is always excluded

        System.out.println(sub);    // "Java"


        String sentence5 = "Today is Sunday, tomorrow is Monday";
        int ind = sentence5.indexOf("S");
        int ind2 = sentence5.indexOf("y,");


        String today = sentence5.substring(ind, ind2 + 1);   // Add + 1. You can also give variable, instead of index number

        System.out.println(today);   // Sunday


        String email = "CydeoSchoolJavaProgramming@yahoo.com"; // we need the domain
        int dom = email.indexOf("@") + 1;
        int dom2 = email.lastIndexOf(".");

        String domain = email.substring(dom, dom2);

        System.out.println(domain);


        // substring() with only beginning Index
        // substring(beginningIndex)
        // creates substring starting from the given beginning index till the end of the String

        String sentence6 = "I love Java programming";

        String r1 = sentence6.substring(7);   // we only need to provide the beginning index

        System.out.println(r1);



        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow = sentence7.substring( sentence7.lastIndexOf(' ') + 1); // We apply space + 1

        System.out.println(tomorrow); // Monday


        String sentence8 = "I study at Cydeo School";
        String school = sentence8.substring(11); // C

        System.out.println(school); // Cydeo School



        System.out.println("-------------------------------------------------------------------");
        // repeat() method
        // repeat(count)
        // repeats the string for given number of times, returns String


        String str = "Python ";

        String result = (str + "\n") .repeat(10); // repeats Python 10 times // we add concatenation to give new lines

        System.out.println(result); // Python x10


















    }
}
