package Stack;
import java.util.*;
class Stack {
    int[] arr;
    int top,size;
    Stack(int size) {
        this.size=size;
        arr=new int[size];
        top=-1;
    }

//    /method to insert element into the stack/
    public void push(int x) {
        if(isFull()) {
            System.out.println("Overflow");
            return;
        }
        arr[++top]=x;
        System.out.println("Added element is: "+arr[top]);
    }

//    /method to remove element from the stack/
    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Removed element is:"+arr[top--]);
    }

//    /method to display stack elements/
    public void display() {
        if(top==-1) {
            System.out.println("no elements to display");
            return;
        }
        for(int i=top;i>=0;i--) System.out.print(arr[i]+" ");
        System.out.println();
    }

//    /method to return peek element/
    public void peek() {
        if(!isEmpty()) System.out.println(arr[top]);
        else System.out.println("stack is empty");
    }

//    /method to find if stack is empty or not/
    public boolean isEmpty() {
        if(top==-1) return true;
        return false;
    }

//    /method to find is full or not/
    public boolean isFull() {
        if(top==size-1) return true;
        return false;
    }
}

public class Stack2 {
    public static void main(String[] args) {
        Stack2 ob=new Stack2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Stack");
        System.out.println("Enter the size of the stack:");
        Stack st=new Stack(sc.nextInt());
        st.push(3);
        st.push(5);
        st.push(7);
        st.push(10);
        st.pop();
        st.display();
        st.peek();
    }
}