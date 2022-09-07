package Stack;
import java.math.*;
public class pow_of_two_nums {
    public static void main(String args[]){
        int x=3;
        int n=4;
        int y =pow(x,n);
        System.out.println(y);
    }
    public static int pow(int x, int n){
        int power=x*n;
//        power=power*n;
        return power;

    }
}
