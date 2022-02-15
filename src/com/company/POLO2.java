package com.company;

import java.util.Scanner;

public class POLO2 {
    public static void main(String[] args) {

        int X,Y,A,B,heartRate;
        Scanner input= new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextInt();
        A=input.nextInt();
        B=input.nextInt();
        heartRate=input.nextInt();
        boolean Z,C,H;
        Z=((X+Y)>30);
        C=((A>3)||(B<6));
        H=(heartRate == 70);
        System.out.println("The statement said by the person is "+(Z && C && H));

    }
}
