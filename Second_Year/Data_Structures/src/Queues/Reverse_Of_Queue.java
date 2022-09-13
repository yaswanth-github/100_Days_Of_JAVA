package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_Of_Queue {
    public static void main(String args[]){
        Queue<Integer> Q= new LinkedList<Integer>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        System.out.println(Q);
        Reverse(Q);
        System.out.println(Q);
    }
    static void Reverse(Queue<Integer> Q){
        if(Q.isEmpty()){
            return;
        }
        int temp=Q.peek();
        Q.remove();
        Reverse(Q);
        Q.add(temp);
    }
}
