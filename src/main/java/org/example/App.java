/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        double bmiCalc;

        //asking for info for weight
        System.out.println( "Enter your weight in pounds: " );

        //if number is not entered, this will appear
        while(!scanner.hasNextInt()) {
            System.out.println("Wrong input, enter a number for asked information");
            scanner.nextLine();
        }
        int weight = scanner.nextInt();
        scanner.nextLine();


        //asking for info for height
        System.out.println( "Enter your height in inches: " );

        //if number is not entered, this will appear
        while(!scanner.hasNextDouble()) {
            System.out.println("Wrong input, enter a number for asked information");
            scanner.nextLine();
        }
        double height = scanner.nextDouble();

        //calculating BMI
        bmiCalc = ((weight / (height * height)) * 703);

        //outputting BMI
        System.out.format( "Your BMI is %.1f\n", bmiCalc );

        //seeing if BMI is overweight or not
        String msg = (bmiCalc >= 18.5 && bmiCalc <= 25) ? "You are within the ideal weight range."
                : "You are overweight. You should see your doctor ";
        System.out.println(msg);

    }
}
