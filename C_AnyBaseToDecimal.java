package org.dsa.l1.practice;

import java.util.Scanner;

public class C_anyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scn.nextInt();

        int cn = getValueInDestinationBase(number, 10);

        System.out.println("The converted value is " + cn);
    }

    public static int getValueInDestinationBase(int number, int base) {
        int cn = 0;
        //bp = basePower
        int bp = 1;

        while (number > 0) {
            int rem = number % base;
            number = number / base;

            cn = cn + rem * bp;
            bp = bp * base;
        }
        return cn;
    }
}
