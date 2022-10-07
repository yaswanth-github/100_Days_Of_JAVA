package Test;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String args[]) {
        Bubble_Sort ob = new Bubble_Sort();
        int arr[] = {64,34,25,12,22,11,90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = 1; j < (n - i); j++)
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
    }
}
