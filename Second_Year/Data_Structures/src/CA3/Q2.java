package CA3;

import java.util.Scanner;

public class Q2 {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            duplicateAndMissingIntegers(arr, n);
        }

        // Method to find duplicate and missing integers in array
        static void duplicateAndMissingIntegers(int arr[], int n) {
            // Write your code here
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=0;
            }
            for(int i=0;i<n;i++){
                a[arr[i]-1]+=1;
            }
            for(int i=0;i<n;i++){
                if(a[i]>1){
                    System.out.print((i+1)+" ");
                }
            }
            System.out.println();
            for(int i=0;i<n;i++){
                if(a[i]==0){
                    System.out.print((i+1)+" ");
                }
            }
        }
}
