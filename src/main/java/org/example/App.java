/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.math.BigDecimal;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String str1 = sc.nextLine();
        System.out.print("What is the state? ");
        String str2 = sc.nextLine();
        if(str2.equals("WI"))
        {
            Double tax_rate = 0.055;
            Double subtotal = Double.parseDouble(str1);
            Double tax = subtotal*tax_rate;
            Double total = tax+subtotal;
            System.out.printf("The subtotal is %.2f\n",subtotal);
            System.out.printf("The tax is %.2f\n",tax);
            System.out.printf("The total is %.2f\n",total);
        }
        else
        {
            Double total = Double.parseDouble(str1);
            System.out.printf("The total is %.2f",total);
        }
    }
}
