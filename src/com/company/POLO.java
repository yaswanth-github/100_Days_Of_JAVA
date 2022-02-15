package com.company;

import java.util.Scanner;

public class POLO {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();
        z=x+y;
        System.out.println("The statement said by the person is "+ (z>30));

    }
}
