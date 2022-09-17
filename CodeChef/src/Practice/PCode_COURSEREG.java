package Practice;

import java.util.Scanner;

public class PCode_COURSEREG {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        int t = n.nextInt();
        for(int i = 0; i<t; i++){
            int n1=n.nextInt(), n2=n.nextInt(), n3=n.nextInt();
            if((n1+n3)<=n2){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
