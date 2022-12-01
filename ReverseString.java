//! Simplae class to be able to reverse a string from a scanner input

import java.util.Scanner;


public class ReverseString {
    public static void main(String[] args) {
        // create a userinput with scanner
        Scanner scanner = new Scanner(System.in);

        // create string
        System.out.print("Type in a word: ");
        String str = scanner.nextLine();


        // loop through string backwards
        for(int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }

        scanner.close();
    }
}
