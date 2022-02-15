
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int numberA;
        int numberB;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for a");

        numberA = input.nextInt();

        System.out.println("Enter the value for b");

        numberB = input.nextInt();
        System.out.println(numberA + numberB);
    }
}

