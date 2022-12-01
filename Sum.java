//! The purpose of this class is to make a simple class that sums to integers together.

import java.util.Scanner;



public class Sum {
    public static void main(String[] args) {
        //create user input variable
        Scanner userInput = new Scanner(System.in);

        //first message
        System.out.println("What numbers would you like to sum? ");
        
        //first number
        System.out.print("Number 1: ");
        double number1 = userInput.nextDouble();

        //second number
        System.out.print("Number 2: ");
        double number2 = userInput.nextDouble();

        //print result
        System.out.print("Your sum is: ");
        System.out.println( number1 + number2);


        userInput.close();

    }
}
