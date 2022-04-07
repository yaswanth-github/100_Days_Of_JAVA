package JAVA_CA2.com;
import java.util.*;
public class S2Q1 {
        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Enter Array Length ::");
            int n = input.nextInt();
            for (int i = 0; i < n; i++)
            {
                list.add(input.nextInt());
            }
            reverseArrayList(list);
            for (int i = 0; i < list.size(); i++)
            {
                System.out.print(list.get(i) + " ");
            }
        }

        // Method to reverse the ArrayList
        static void reverseArrayList(ArrayList<Integer> list) {
            int leftIndex = 0, rightIndex = list.size() - 1;
            int temp;
            while (leftIndex < rightIndex) {
                temp = list.get(leftIndex);
                list.set(leftIndex++, list.get(rightIndex));
                list.set(rightIndex--, temp);
            }}}
