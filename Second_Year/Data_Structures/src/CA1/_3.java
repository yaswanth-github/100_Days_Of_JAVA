package CA1;

import java.util.*;

public class _3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        kMaxSumsOfSUBArrays(arr, n, k);
    }

    // Method to find k unique subarrays which have maximum sums
    static void kMaxSumsOfSUBArrays(int[] arr, int n, int k) {
        int sum[] = new int[10000];
        int count =-1;
        for( int i=0; i<n; i++ ){
            for( int j=i; j<n; j++ ){
                int tempsum =0;
                for( int p=i; p<=j; p++ ){
                    tempsum = tempsum+arr[p];
                }
                ++count;
                sum[count]=tempsum;
            }
        }
        for (int i = 0; i < count; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j <= count; j++)
                if (sum[j] > sum[min_idx])
                    min_idx = j;
            int temp = sum[min_idx];
            sum[min_idx] = sum[i];
            sum[i] = temp;
        }
        for(int i=0;i<k;i++){
            System.out.print(sum[i]+" ");
        }
    }
}