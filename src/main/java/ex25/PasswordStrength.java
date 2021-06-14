/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex25;

import org.junit.jupiter.api.Test;
import java.util.Scanner;


public class PasswordStrength {
    @Test
    public static void passwordValidator(String password)
    {
        String upperCase = "(.*[A-Z].*)";
        String lowerCase = "(.*[a-z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[!@#$%^&+=].*)";
        int length1 = password.length();

        if(password == null)
        {
            System.out.println("Password is invalid");
        }
        if(password.matches(numbers) && (length1 < 8))
        {
            System.out.printf("The password '%s'is a very weak password.", password);
        }
        if((password.matches(lowerCase) || (password.matches(upperCase))) && (length1 < 8))
        {
            System.out.printf("The password '%s'is a weak password.", password);
        }
        if((password.matches(lowerCase) || (password.matches(upperCase))) && (password.matches(numbers)) && (length1 >= 8) && (!password.matches(specialChars)))
        {
            System.out.printf("The password '%s'is a strong password.", password);
        }
        if((password.matches(lowerCase) || (password.matches(upperCase))) && (password.matches(numbers)) && (password.matches(specialChars)) && (length1 >= 8))
        {
            System.out.printf("The password '%s'is a very strong password.", password);
        }

    }
    public static void main(String args[])
    {
        Scanner pswdCheck = new Scanner(System.in);

        System.out.print("Please enter password: ");
        String str1 = pswdCheck.nextLine();

        passwordValidator(str1);
    }
}


