/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex28;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class AddingNumbers {
    @Test

    public static void main (String args[])
    {
        int sum = 0;
        int numbers = 0;
        for (int i = 0; i <= 4; i++)
        {
            Scanner add = new Scanner(System.in);

            System.out.print("Enter a number: ");
            numbers = add.nextInt();

            sum += numbers;
        }
        System.out.print("The total is: "+sum);
    }
}
