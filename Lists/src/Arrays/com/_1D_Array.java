package Arrays.com;
import java.util.ArrayList;

public class _1D_Array {
    public static void main(String args[]){
        ArrayList array= new ArrayList();
        array.add(20);
        array.add(15);
        array.add(22);
        System.out.println(array.size());
        array.remove(0);
        System.out.println(array);
        System.out.println(array.contains(20));
    }
}
