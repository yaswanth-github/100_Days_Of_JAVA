package com.company;

import java.util.Scanner;

public class q3age {
    public static void main(String[] args) {
        int myAge;
        int ageOfBrother;
        //Write your code here
        Scanner input=new Scanner(System.in);
        myAge=input.nextInt();
        ageOfBrother=input.nextInt();
        boolean discount = (((myAge<25) && (ageOfBrother<25))&&((myAge>0) && (ageOfBrother>0)));
        System.out.println(discount);


    }
}
