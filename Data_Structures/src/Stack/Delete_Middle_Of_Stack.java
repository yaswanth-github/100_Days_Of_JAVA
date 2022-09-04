package Stack;
import java.io.*;
import java.util.Stack;

class delMiddle
{
    public static void main(String args[])
    {
        Stack<Character> st = new Stack<Character>();

            st.push('5');
            st.push('4');
            st.push('3');
            st.push('2');
            st.push('1');
            System.out.print("Before deleting:");
            System.out.println(st);
            System.out.print("After deleting:");
            deleteMiddle(st, st.size(), 0);
            System.out.print(st);

        }
        static void deleteMiddle(Stack<Character> st, int n, int curr)
        {
        if(st.empty() || curr == n)
        {
            return;
        }
        char x = st.pop();
        deleteMiddle(st, n, curr+1);
        dele( st, n,curr,x);
        }
        static void dele(Stack<Character> st, int n, int curr, char x){
        if(curr != n/2)
        {
            st.push(x);
        }
    }
}

