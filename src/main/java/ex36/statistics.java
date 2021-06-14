/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex36;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class statistics {
    @Test
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> stats = new ArrayList<Integer>();

        for (int i = 0; i <= 4; i++){
            System.out.print("Enter a number: ");
        while (input.hasNextInt()) {
            int s = input.nextInt();
            stats.add(s);
        }
        System.out.println("Numbers:" + stats);

        double total = 0;
        for (int j = 0; j < stats.size(); j++)
            {

                total = total + stats.size();
            }
        double average = total / stats.size();
        System.out.println("The average is: " + average);
        }
    }
}