package Stack;
import  java.util.Stack;
public class SortStack {
    public static void sort(Stack<Integer> st){
        if(st.isEmpty())
        {
            return;
        }

        int temp = st.pop();
        sort(st);
        insertAtCorrectPosition(st, temp);
    }
    public static void insertAtCorrectPosition(Stack<Integer> st, int temp) {
        if(st.isEmpty() || st.peek() > temp)
        {
            st.push(temp);
            return;
        }
        int elem = st.pop();

        insertAtCorrectPosition(st, temp);
        st.push(elem);
   }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(9);
        st.push(-1);
        st.push(120);
        st.push(2);
        System.out.println(st);
        sort(st);
        System.out.println(st);
    }
}
