package Stack;
import java.io.*;
import java.util.Scanner;
import java.util.Stack;

class delNele
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int m= input.nextInt();
        Stack<Integer> st = new Stack<Integer>();

        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.print("Before deleting:");
        System.out.println(st);
        System.out.print("After deleting:");
        deleteMiddle(st, st.size(), 0,m);
        System.out.print(st);

    }
    static void deleteMiddle(Stack<Integer> st, int n, int curr,int m)
    {
        if(st.empty() || curr == n)
        {
            return;
        }
        int x = st.pop();
        deleteMiddle(st, n, curr+1,m);
        if(curr != m)
        {
            st.push(x);
        }
    }
}