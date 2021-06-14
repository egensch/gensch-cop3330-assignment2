/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex29;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class BadInput {
    @Test

    public static void main(String args[])
    {
        int i = 1;
        Scanner input = new Scanner(System.in);
       while(i > 0)
       {
         System.out.print("What is the rate of return? ");
         String number = input.nextLine();

         if (number.matches("(.*[A-Z].*)") || number.matches("(.*[a-z].*)") || number.matches("(.*[0].*)"))
         {
             System.out.println("Sorry. That is not a valid input.");
         }
        else
         {
             int r = Integer.parseInt(number);
             int years = 72 / r;
             System.out.printf("It will take %d years to double your initial investment.\n", years);
             System.exit(0);
         }
       }
    }
}