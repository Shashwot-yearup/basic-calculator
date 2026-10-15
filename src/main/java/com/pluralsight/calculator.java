package com.pluralsight;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //created a scanner

        // asked for the first question.
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        //asked for the second question.
        System.out.println("Enter the second number::");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        //possible calculation for the user input.
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");




    }
}
