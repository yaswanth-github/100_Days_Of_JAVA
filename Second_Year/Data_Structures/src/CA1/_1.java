package CA1;
import java.io.*;
import java.util.*;
import java.lang.Math;

public class _1 {
    public static int calculateFunction(int[] A){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        int sum = 0;
        int length = A.length;

        for(int i = 0; i < length; i++) {
            stack.push(A[i]);
            queue.add(A[i]);
        }

        while(!stack.isEmpty()) {
            sum = sum + Math.abs((stack.pop() - queue.poll()));
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] A = new int[N];
        for(int j=0;j<N;j++){
            A[j]=scan.nextInt();
        }
        int result;
        result = calculateFunction(A);
        System.out.print(result);
        return ;
    }
}
