/*
 * UCF COP3330 Fall 2021 Assignment 5 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "What is the first number?" );
        String FirstNumber = input.nextLine();
        int num1 = Integer.valueOf(FirstNumber);

        System.out.println( "What is the second number?" );
        String SecondNumber = input.nextLine();
        int num2 = Integer.valueOf(SecondNumber);

        int add = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println(FirstNumber + " + " + SecondNumber + " = " + add + "\n" +
                FirstNumber + " - " + SecondNumber + " = " + sub + "\n" +
                FirstNumber + " * " + SecondNumber + " = " + mult + "\n" +
                FirstNumber + " / " + SecondNumber + " = " + div);
    }
}
