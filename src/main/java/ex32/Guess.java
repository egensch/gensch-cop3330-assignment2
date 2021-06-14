 /*
  *  UCF COP3330 Summer 2021 Assignment 2 Solution
  *  Copyright 2021 Emily Gensch
  */
package ex32;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

    public class Guess {
        @Test
        public static void difficulty1(String level1)
        {
            int counter = 0;
            int guess = 0;
            Scanner numbers = new Scanner(System.in);

            Random rand = new Random();
            int rand_int1 = rand.nextInt(11);

            System.out.print("I have my number. What's your guess? ");
            guess = numbers.nextInt();
            counter++;

            while (guess != rand_int1)
            {
                if(guess > rand_int1)
                {
                    System.out.print("Too high. Guess again: ");
                    guess = numbers.nextInt();
                    ++counter;
                }
                if(guess < rand_int1)
                {
                    System.out.print("Too low. Guess again: ");
                    guess = numbers.nextInt();
                    ++counter;
                }

            }
            if (guess == rand_int1)
            {
                System.out.printf("You got it in %d guesses!\n\n", counter);
            }
                counter = 0;
        }

        public static void difficulty2(String level2)
        {
            int guess = 0;
            int counter = 0;
            Scanner numbers = new Scanner(System.in);

            Random rand = new Random();
            int rand_int1 = rand.nextInt(101);

            System.out.print("I have my number. What's your guess? ");
            guess = numbers.nextInt();
            ++counter;

            while (guess != rand_int1) {
                if (guess > rand_int1) {
                    System.out.print("Too high. Guess again: ");
                    guess = numbers.nextInt();
                    ++counter;

                }
                if (guess < rand_int1) {
                    System.out.print("Too low. Guess again: ");
                    guess = numbers.nextInt();
                    ++counter;
                }

            }
            if (guess == rand_int1) {
                System.out.printf("You got it in %d guesses!\n\n", counter);

            }
            counter = 0;
        }

        public static void difficulty3(String level3)
        {
            int guess = 0;
            int counter = 0;
            Scanner numbers = new Scanner(System.in);

            Random rand = new Random();
            int rand_int1 = rand.nextInt(1001);

            System.out.print("I have my number. What's your guess? ");
            guess = numbers.nextInt();
            ++counter;

            while (guess != rand_int1)
            {
                if (guess > rand_int1)
                {
                    System.out.print("Too high. Guess again: ");
                    guess = numbers.nextInt();
                    ++counter;
                }
                if (guess < rand_int1)
                {
                    System.out.print("Too low. Guess again: ");
                    guess = numbers.nextInt();
                    ++counter;
                }

            }
            if (guess == rand_int1)
            {
                System.out.printf("You got it in %d guesses!\n\n", counter);
            }
            counter = 0;
        }
        public static void main(String args[]) {

            System.out.println("Let's play Guess the Number!\n");

            char playagain = 'y';
            while (playagain == 'y' ||  playagain == 'Y')
            {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                Scanner choose = new Scanner(System.in);
                String choice = choose.nextLine();


                if (choice.matches("(.*[A-Z].*)") || choice.matches("(.*[a-z].*)")) {
                    System.out.println("Sorry. That is not a valid input.");
                }

                switch (choice) {
                    case "1":
                        difficulty1("1");
                        break;
                    case "2":
                        difficulty2("2");
                        break;
                    case "3":
                        difficulty3("3");
                        break;
                }
                System.out.print("Would you like to play again? (Y/N)? ");
                playagain = choose.next().charAt(0);

                if (playagain == 'n' || playagain == 'N')
                {
                    System.exit(0);
                }

            }
        }
}
