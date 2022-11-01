package Stack;

import java.util.Stack;

public class Find_Middle_Element_of_Stack {
    public static void main(String args[]){
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack :: "+st);
        System.out.println("First Element :: "+st.firstElement());
        System.out.print("Middle Element :: ");
        mid(st,st.size(),0);
        System.out.println("Last Element :: "+st.lastElement());
    }

    public static void mid(Stack<Integer> st,int n,int a){
        if((n/2)==a){
            System.out.println(st.peek());
            return;
        }
        int temp = st.pop();
        mid(st,n,a+1);
        st.push(temp);
    }
}
