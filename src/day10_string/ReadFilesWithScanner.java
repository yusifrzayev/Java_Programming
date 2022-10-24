package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_string/Test.txt"));

        // System.out.println( scan.next() );  it will read the first word from the file
        System.out.println(scan.nextLine()); // it will read the whole first line
        System.out.println(scan.nextLine()); // it will read the whole second line
        System.out.println(scan.nextLine()); // will read 3rd line

        System.out.println(scan.hasNext()); // will show, does the line has word or words, true or false

        scan.close();


    }
}
