package org.example;
import java.util.Scanner;
/**
 * What is the length of the room in feet? 15
 * What is the width of the room in feet? 20
 * You entered dimensions of 15 feet by 20 feet.
 * The area is
 * 300 square feet
 * 27.871 square meters
 *
 */


/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in= new Scanner(System.in);
        int L,W;
        int A;
        double sqm;

        System.out.print( "What is the length of the room in feet? " );
        L=in.nextInt();
        System.out.print( "What is the width of the room in feet? " );
        W=in.nextInt();
        System.out.println( "You entered dimensions of "+L +" feet by "+ W +" feet." );
        A=L*W;
        double c=0.09290304;
        sqm=(c*A)*1.000;
        System.out.println( "The area is\n" + A +" square feet");
        System.out.format("%.3f",sqm);
        System.out.print(" square meters");

    }
}
