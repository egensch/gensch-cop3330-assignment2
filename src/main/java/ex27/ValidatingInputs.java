/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex27;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class ValidatingInputs {
@Test
    public static boolean fName(String firstName) {
        String upperCase = "(.*[A-Z].*)";
        String lowerCase = "(.*[a-z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[!@#$%^&+=].*)";

        int fnamelen = firstName.length();
        if ((firstName == null) || (fnamelen <= 2) || firstName.matches(numbers))
        {
            System.out.println("The first name must be at least 2 characters long.");
            System.exit(0);
        }
        else
        {
            return true;
        }
        return true;
    }

    public static boolean lName(String lastName) {
        String upperCase = "(.*[A-Z].*)";
        String lowerCase = "(.*[a-z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[!@#$%^&+=].*)";

        int fnamelen = lastName.length();
        if ((fnamelen <= 2) || lastName.matches(numbers))
        {
            System.out.println("The last name must be at least 2 characters long.");

            if (lastName.matches(""))
            {
                System.out.println("The last name must be filled in.");
                System.exit(0);
            }
            System.exit(0);
        }

        else
        {
            return true;
        }
        return true;
    }

    public static boolean zip(String zipCode) {
        String upperCase = "(.*[A-Z].*)";
        String lowerCase = "(.*[a-z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[!@#$%^&+=].*)";

        int zipLen = zipCode.length();
        if ((zipLen < 5) || (zipLen > 5) || (zipCode.matches(upperCase)) || (zipCode.matches(lowerCase)))
        {
            System.out.println("The zipcode must be a 5 digit number.");
            System.exit(0);
        }
        else
        {
            return true;
        }
        return true;
    }

    public static boolean employeeId(String id) {
        String upperCase = "(.*[A-Z].*)";
        String lowerCase = "(.*[a-z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[!@#$%^&+=].*)";

        if (!id.matches("[A-Z]{2}-\\d{4}"))
        {
            System.out.println("The employee ID must be in the format of AA-1234.");
            System.exit(0);
        }
        else
        {
            return true;
        }
        return true;
    }


    public static boolean validateInput()
    {
        Scanner employee = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = employee.nextLine();
        fName(firstName);

        System.out.print("Enter the last name: ");
        String lastName = employee.nextLine();
        lName(lastName);

        System.out.print("Enter the ZIP code: ");
        String zipCode = employee.nextLine();
        zip(zipCode);

        System.out.print("Enter the employee ID: ");
        String id = employee.nextLine();
        employeeId(id);

        return true;
    }

    public static void main (String args[])
    {
            if(validateInput() == true){
                System.out.println("There were no errors found.");
            }

    }
}