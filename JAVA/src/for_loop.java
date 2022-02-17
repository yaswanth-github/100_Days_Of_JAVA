import java.util.Scanner;

//class p2{
//    int i=0;
//    for (int i = 10; i != 20; i = i + 3) {
//        System.out.println("Hello");
//    }
//}
public class for_loop {
    public static void  main(String args[]){
        Scanner in = new Scanner(System.in);
        int i,n=0,s=0,m=0;
        m = in.nextInt();
        int avg;
        for (i=0;i<m;i++)
        {
            n = in.nextInt();

            s +=n;
        }
        avg=s/m;
        System.out.println(avg);
    }
}
