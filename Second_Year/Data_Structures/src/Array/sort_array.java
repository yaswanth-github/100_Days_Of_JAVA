package Array;

import java.util.Arrays;

public class sort_array {
    public static void main(String args[]) {
        int[] a = new int[]{2, 4, 8, 1, 9, 7};

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
