package WC311;
import java.util.Scanner;

public class Smallest_Even_Multiple {
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        int n = num.nextInt();
        if(n%2==0){

            System.out.println(n);
        }
        else {
            n=n*2;
            System.out.println(n);
        }

    }
}
