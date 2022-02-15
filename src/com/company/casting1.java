package com.company;

import java.util.Scanner;

public class casting1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        float f=input.nextFloat();
        double d=input.nextDouble();

        float x= a;
        int y = (int)f;
        float z= (float)d;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
