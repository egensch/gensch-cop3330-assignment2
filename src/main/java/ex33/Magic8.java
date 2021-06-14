/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex33;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

public class Magic8 {
    @Test
    public static void main(String args[])
    {
        String[] phrases = {"Yes", "No", "Maybe", "Ask again later."};

        System.out.println("What is your question? ");
        System.out.print("> ");

        Scanner magic = new Scanner(System.in);
        String question = magic.nextLine();

        Random r = new Random();
        int randomPhrase = r.nextInt(phrases.length);
        System.out.println(phrases[randomPhrase]);
    }
}