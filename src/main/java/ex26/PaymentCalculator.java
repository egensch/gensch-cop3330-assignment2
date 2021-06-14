/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex26;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static java.lang.Math.log;
import java.lang.Math;

public class PaymentCalculator {
@Test
    public static void MonthsUntilPaidOff()
    {
        Scanner money = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance = money.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = money.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        double payment = money.nextDouble();

        double b = balance; //balance
        apr = apr / 100; //converting apr from percent
        double i = apr / 12; //interest
        double p = payment; //monthly payment

        double n = (Math.log(p/(p-b*i)))/(Math.log(1+i));
        System.out.printf("It will take you %.0f months to pay off this card.", n);

    }

    public static void main (String args[])
    {
        MonthsUntilPaidOff();
    }
}
