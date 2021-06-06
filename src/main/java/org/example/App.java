/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        String output = " cans of paint";

        System.out.print("Input the area to cover (in 'sq ft'): ");
        int area = input.nextInt();

        int cansNeeded = paintCalc((double)area);
        if (cansNeeded == 1)
            output = " can of paint";

        System.out.println("you will need " + cansNeeded + output);
    }

    private static int paintCalc(double area) {
        double areaPerCan = 350;
        double cans = Math.ceil(area / areaPerCan);
        return (int)cans;
    }
}
