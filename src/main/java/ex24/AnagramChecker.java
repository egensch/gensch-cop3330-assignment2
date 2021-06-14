/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex24;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker
       {
           @Test
           public static boolean isAnagram(String str1, String str2)
           {
               int length1 = str1.length();
               int length2 = str2.length();

               if (length1 != length2)
                   return false;

               char[] str1sort = str1.toLowerCase().toCharArray();
               char[] str2sort = str2.toLowerCase().toCharArray();
               Arrays.sort(str1sort);
               Arrays.sort(str2sort);

               for(int i = 0; i < length1; i++)
               {
                   if (str1sort[i] != str2sort[i])
                   {
                       return false;
                   }
               }
               return true;
           }


           public static void main(String[] args ) {
               System.out.println("Enter two strings and I'll tell you if they are anagrams:");
               Scanner strings = new Scanner(System.in);

               System.out.print("Enter the first string: ");
               String str1 = strings.nextLine();
               System.out.print("Enter the second string: ");
               String str2 = strings.nextLine();

               if (isAnagram(str1, str2)) {
                   System.out.printf("\"%s\" and \"%s\" are anagrams.", str1, str2);
               }
               else
               {
                   System.out.printf("\"%s\" and \"%s\" are not anagrams.", str1, str2);
               }
           }
       }

