import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the number
        int number = scan.nextInt();
        int result = 1;
        if(number >= 2) {

            while (result<number){
                result=result*2;
                number--;
            }
            System.out.print(result);
        } else {
            System.out.print("Please enter an integer >= 2");
        }
        scan.close();
    }
}
