package Array;

import java.util.Arrays;

public class median_of_array {
    public static void main(String[] args) {
        int a[] = {6, 4, 1};
        int b[] = {5, 2, 3};
        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;
        int c[] = new int[c1];
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("UnSorted Array :: " + Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("Sorted Array :: " + Arrays.toString(c));
        if (c1 % 2 != 0){
            System.out.println(c[c1/2]);
        }
        System.out.println((a[(c1-1)/2]+ c[c1/2])/2);
    }
}
