package Practice;

import java.util.Scanner;

public class Week_code {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt(), n2 = n.nextInt(), n3 = n.nextInt(), n4 = n.nextInt();

        int num = 0;
        if(n1>=10){
            num=num+1;
        }
        if(n2>=10){
            num=num+1;
        }
        if(n3>=10){
            num=num+1;
        }
        if(n4>=10){
            num=num+1;
        }
        System.out.println(num);
    }
}
