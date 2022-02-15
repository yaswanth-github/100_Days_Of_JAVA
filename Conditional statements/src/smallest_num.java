import java.util.Scanner;

public class smallest_num {
    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        if (n1 < n2) {
            if (n1 < n3) {
                System.out.println("The smallest number entered is " + n1);
            }
            else{
                System.out.println("The smallest number entered is " + n3);
            }
        }
        else {
            if (n2 < n3) {
                System.out.println("The smallest number entered is " + n2);
            }
            else{
                System.out.println("The smallest number entered is "+n3);
            }
        }
    }
}
