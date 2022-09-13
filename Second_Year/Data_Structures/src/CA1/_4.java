package CA1;

import java.util.*;

public class _4 {

    /*implementing queue using linked list */
    Queue < Integer > queue = new LinkedList < Integer > ();

    /* Push operation of stack using queue*/
    void push(int new_data) {
        queue.add(new_data);
        int lengt = queue.size();
        for(int i = 0; i <lengt - 1;i++ ){
            queue.add(queue.poll());
        }
        //Write your code here
    }

    //Removes the top element of the stack/

    int pop() {
        if(!queue.isEmpty()){
            return queue.poll();
        }
        else{
            System.out.println("The stack is empty");
            return -1;
        }

        //Write your code here
    }

    /* Returns true if Stack is empty else false */
 /*boolean isEmpty() {
  return queue.isEmpty();
 }*/


    /*Returns the element at the top of the stack */
    int top() {
        if(queue.isEmpty()){
            System.out.println("The stack is empty");
            return 0;
        }
        else{
            return queue.peek();
        }
        //Write your code here
    }


    public static void main(String[] args) {
        _4 obj = new _4();
        Scanner in = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        /*Enter the number of elements you want to add in the stack */

        int n = in .nextInt();

        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            stk.push( in .nextInt());
        }
        if(stk.isEmpty()){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println(stk.peek());
            stk.pop();
            if(stk.isEmpty()){
                System.out.println("The stack is empty");
            }
            else{
                System.out.println(stk.peek());
            }

        }
    }
}