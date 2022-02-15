package com.company;

import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for a");
        a = input.nextInt();

        System.out.println("Enter the value for b");
        b = input.nextInt();

        System.out.println("Enter the value for c");
        c = input.nextInt();

        int d = a * b + c;

        System.out.println(d);
    }
}
