package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("What do you want to do?");
        System.out.println(" (A)dd\n" +
                " (S)ubtract\n" +
                " (M)ultiply\n" +
                " (D)ivide");
        String action = scanner.nextLine();

        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
    }
}
