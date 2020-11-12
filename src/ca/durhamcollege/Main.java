/*
Author: Fleur Blanckaert
Date: November 11, 2020
 */



package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //VARIABLE DECLARATION
        Scanner keyboard = new Scanner(System.in);

        //INPUT
        String name = null;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;


        boolean isValidInput = false;

        do
        {
            System.out.print("Please enter your age: ");
            try
            {
                age = keyboard.nextFloat();
                isValidInput = true;

                if ((age <= 0.0f) || (age >= 120.0f))
                {
                    System.out.println("Error: You must enter an age greater than 0 and less that 120 years old");
                    keyboard.nextLine();
                    isValidInput = false;
                }
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("Error: You must entered an invalid floating point number");
                keyboard.nextLine();
                isValidInput = false;
            }
        }
        while(!isValidInput);

            System.out.println();

            //OUTPUT
            System.out.printf("You entered: %s \n", name);
            System.out.printf("You entered: %.2f \n", age);

        //MULTI-DIMENSIONAL ARRAY
        System.out.println("Multi-Dimensional Array example");
        int rows = 8;
        int cols = 8;
        float[][] board = new float[rows][cols];

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                board[x][y] = (float)(Math.random() * 100.0) + 1.0f;
            }
        }

        System.out.println("Showing 10 Random Values: ");
        for (int i = 0; i < 10; i++) {
            var randRows = (int)(Math.random() * rows);
            var randCols = (int)(Math.random() * cols);
            System.out.print("For row: " + randRows + " col: " + randCols + " ");
            System.out.printf("The Random number is: %.2f \n", board[randRows][randCols]);
        }

    }
    }

