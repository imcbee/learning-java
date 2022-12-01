//! Simple class to be able to reverse a string from a scanner input

import java.util.Scanner;
import java.util.ArrayList;

public class ReverseString {
    public static void main(String[] args) {
        // create a userInput with scanner
        Scanner scanner = new Scanner(System.in);

        // create string
        System.out.print("Type in a word: ");
        String str = scanner.nextLine();

        //convert string into an array
        char str1[] = str.toCharArray();

        //new var for new reversed string
        ArrayList<Character> newStr = new ArrayList<Character>();


        // loop through string backwards
        for(int i=str1.length-1; i>=0; i--) {
            newStr.add(str1[i]);
        }

        System.out.println(newStr);
        scanner.close();
    }
}
