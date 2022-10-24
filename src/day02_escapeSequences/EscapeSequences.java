package day02_escapeSequences;

public class EscapeSequences {

    public static void main(String[] args){

        System.out.println("Hello everyone\nToday we hava Java class");
        // \n stands for new line, so we don't need new print statement for new text as a next message on the console

        System.out.println("---------------------");

        System.out.println("\tJava Programming Language");
        System.out.println("\t\tJava Developer Course Batch 1");
        //\t stands for horizontal tab, it gives a paragraph text

        System.out.println("\tJava\n\tProgramming\n\tLanguage");
        //If you use \n\t... it will start the text with a paragraph on a new line

        System.out.println("---------------------");

        System.out.println("\\");
        // \\ stands for backslash, used if you want to print a \ (backslash) on the console

        System.out.println("---------------------");

        System.out.println("My favorite TV show is \"Breaking Bad\"");
        //\" stands for double quote, use d if you want to quote something in the text

        System.out.println("---------------------");

        System.out.println("My favorite TV show is \n\"Breaking Bad\"");
        //If you want to start on new line, use \n
    }
/*
    1. \n New line
    2. \t Paragraph space
    3. \\ Back slash
    4. \" Double quote
    5. You can also combine these escape sequences to modify your text
 */

}
