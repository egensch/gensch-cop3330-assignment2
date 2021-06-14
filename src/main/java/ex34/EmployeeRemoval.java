/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex34;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class EmployeeRemoval {
    @Test
    public static void main(String args[])
    {
        String names[] = new String[5];
        names[0] = "John Smith";
        names[1] = "Jackie Johnson";
        names[2] = "Chris Jones";
        names[3] = "Amanda Cullen";
        names[4] = "Jeremy Goodwin";

        System.out.printf("There are %s employees:\n", names.length);
        for (int i = 0; i <= 4; i++)
        {
            System.out.print(names[i] + "\n");
        }

        System.out.printf("\nEnter an employee name to remove: ");
        Scanner name = new Scanner(System.in);
        String remove = name.nextLine();

        for( int i = 0; i < names.length; i++)
        {
            if(names[i] == remove)
            {
                for (int j = i; j < names.length - 1; j++)
                {
                    names[j] = names[j+1];
                }
            }
        }
        System.out.printf("\nThere are %s employees:\n", names.length - 1);
        for (int i = 0; i < names.length - 1 ; i++)
        {
            System.out.print(names[i] + "\n");
        }


    }
}
