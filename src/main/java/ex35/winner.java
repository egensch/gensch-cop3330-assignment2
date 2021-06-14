/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex35;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class winner {
    @Test
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        for (int i = 0; i <= 4; i++) {
            System.out.print("Enter a name: ");
            names.add(input.nextLine());
        }
        for (int j = 0; j < 1; j++) {
            int index = (int) (Math.random() * names.size());
            System.out.println("And the winner is... " + names.get(index));
        }
    }

}
