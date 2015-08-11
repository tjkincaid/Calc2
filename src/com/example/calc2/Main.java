package com.example.calc2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        double d1 = 0;
        double d2 = 0;

        try {
            System.out.println("Enter a number");
            String scan1 = sc.nextLine();
            d1 = Double.parseDouble(scan1);

            System.out.println("Enter another number");
            String scan2 = sc.nextLine();
            d2 = Double.parseDouble(scan2);

            System.out.println("Enter an Opperator (+, -, *, /)");
            String scan3 = sc.nextLine();

            calculate(d1, d2, scan3);
        } catch (NumberFormatException e) {
            System.out.println("That wasn't a number!");

            //e.printStackTrace();
            // test github
        }

    }

    static void calculate(double s1, double s2, String s3){
        // check for operation type and calculate
        //float result = 0

            switch (s3){
                case "+":
                    System.out.println(s1+s2);
                    break;
                case "-":
                    System.out.println(s1-s2);
                    break;
                case "*":
                    System.out.println(s1*s2);
                    break;
                case "/":
                    System.out.println(s1/s2);
                    break;
                default:
                    System.out.println("You didn't use a proper operator!");

        }
    }
}

