package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asked for the name
        System.out.println("What is your name:");
        String Name = scanner.nextLine();

        //asked for their hours
        System.out.println("How many hours do you work:");
        double hours = scanner.nextDouble();

        //asked for their hourly pay
        System.out.println("What is your hourly pay:");
        double hourlyPay = scanner.nextDouble();

        double grossPay = hours * hourlyPay; // calulated the gross pay

        //printed the output.
        System.out.println(Name + " your gross income is " + grossPay);
    }
}
