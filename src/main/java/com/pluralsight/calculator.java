package com.pluralsight;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //created a scanner

        // asked for the first question.
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        //asked for the second question.
        System.out.println("Enter the second number::");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();

        //possible calculation for the user input.
        System.out.println("""
        Possible calculations:
            (A)dd
            (S)ubtract
            (M)ultiply
            (D)ivide
        Please select an option:
        """);
        String input = scanner.nextLine();

        // does the multiplication
        int total = firstNumber * secondNumber;
        System.out.println(total);




    }
}
