package Stack;
import java.util.Stack;

public class Reversing_Of_Stack {

//    static void reverse(){
//        if (st.size() > 0){
//            int x = st.peek();
//            st.pop();
//            reverse();
//            insert_at_bottom(x);
//        }
//    }

    public static void main(String args[]) {
//  Implementation of Stack
    Stack<Integer> st = new Stack<Integer>();
//  Pushing Elements into Stack st
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    // Printing Stack st Before Reversing
    System.out.println(st);
    }
}