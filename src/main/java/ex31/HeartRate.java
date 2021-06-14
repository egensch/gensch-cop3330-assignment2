/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex31;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.util.Scanner;

public class HeartRate {
    @Test

    public static void main(String args[]) {
        int i = 1;
        String restingHR;
        Scanner hrtrate = new Scanner(System.in);

        while (i > 0)
        {
            System.out.print("What is your age? ");
            String age = hrtrate.nextLine();

            if (age.matches("(.*[A-Z].*)") || age.matches("(.*[a-z].*)"))
            {
                System.out.println("Sorry. That is not a valid input.");
            }
            else
            {
                System.out.print("What is your resting heartrate? ");
                restingHR = hrtrate.nextLine();

                if (restingHR.matches("(.*[A-Z].*)") || restingHR.matches("(.*[a-z].*)"))
                {
                    System.out.println("Sorry. That is not a valid input.");
                }

                double age1 = Double.parseDouble(age);
                double restingHR1 = Double.parseDouble(restingHR);

                System.out.printf("Resting pulse: %-10.0f Age: %-10.0f\n\n", restingHR1, age1);
                System.out.println("Intensity\t|Rate");
                System.out.println("------------|-------");

                for (double intensity = 55; intensity <= 95; intensity += 5)
                {
                    double TargetHeartRate = (((220 - age1) - restingHR1) * (intensity/100) + restingHR1);
                    System.out.printf("%.0f%%\t\t\t|%.0f bpm\n", intensity, TargetHeartRate);
                }
                System.exit(0);
            }
        }
    }
}
