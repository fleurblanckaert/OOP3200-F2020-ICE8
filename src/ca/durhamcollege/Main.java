/*
Author: Fleur Blanckaert
Date: November 11, 2020
 */



package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //VARIABLE DECLARATION
        Scanner keyboard = new Scanner(System.in);

        //INPUT
        String name = null;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();
        System.out.println();

        //OUTPUT
        System.out.printf("You entered: %s \n",name);
        System.out.printf("You entered: %.2f \n",age);
    }
}
