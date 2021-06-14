/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex30;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class MultiplicationTable {
    @Test

    public static void main(String args[])
    {
        int arrMultiTbl[][] = new int[12][12];
        int row = 1, column = 1;

        for (int a = 0; a < arrMultiTbl.length; a++)
        {
            for (int b = 0; b < arrMultiTbl[a].length; b++)
            {
                arrMultiTbl[a][b] = row * column;
                column = column + 1;
            }
            row = row + 1;
            column = 1;
        }
        for (int a = 0; a < arrMultiTbl.length; a++)
        {
            for (int b = 0; b < arrMultiTbl[a].length; b++)
            {
                System.out.printf("%5s", arrMultiTbl[a][b]);
            }
            System.out.print('\n');
        }
    }
}
