package CA1;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class _2 {
    public static int calculateFunction(int[] A){
        //write your code here
        Stack<Integer> stk = new Stack<>();
        Queue<Integer> qu = new LinkedList<>();
        int sum = 0;
        int lengt = A.length;
        for(int i = 0; i < lengt;i++){
            stk.push(A[i]);
            qu.add(A[i]);
        }
        while(!stk.isEmpty()){
            sum =sum + Math.abs(( qu.poll() - stk.pop()));
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
