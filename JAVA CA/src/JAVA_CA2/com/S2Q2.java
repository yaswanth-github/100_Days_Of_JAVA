package JAVA_CA2.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter Number Of People: ");
            int NOP = input.nextInt();//NOP=Number Of People
            int [] Age = new int[NOP];

            System.out.println("Enter " + NOP + " Persons Age:");
            for (int i = 0; i < Age.length; i++) {
                Age[i] = input.nextInt();
            }
            int max = getMaxAge(Age);
            int min = getMinAge(Age);

            System.out.println("Maximum Age: " + max);
            System.out.println("Minimum Age: " + min);

        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT >> PLEASE INPUT A NUMBER");
        }
    }

    private static int getMaxAge(int[] Age) {
        int maxAge = Age[0];
        for (int i = 0; i < Age.length; i++){
            if (Age[i] > maxAge){
                maxAge = Age[i];
            }
        }
        return maxAge;
    }

    private static int getMinAge(int[] Age) {
        int minAge = Age[0];
        for (int i = 0; i < Age.length; i++){
            if (Age[i] < minAge) {
                minAge = Age[i];
            }
        }
        return minAge;
    }
}

