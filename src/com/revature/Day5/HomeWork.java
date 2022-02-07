package com.revature.Day5;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        double a;
        String b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter an operator");
        b = scanner.nextLine();
        System.out.println("Enter a number");
        c = Double.parseDouble(scanner.next());

        switch (b){
            case "+":
                System.out.println("Output: " + (a + c));
                break;
            case "-":
                System.out.println("Output: " + (a - c));
                break;
            case "*":
                System.out.println("Output: " + (a * c));
                break;
            case "/":
                System.out.println("output: " + (a / c));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + b);
        }

    }
}
