import java.util.Scanner;

public class LQ1_try {
    public static void main(String args[]){

        Exam M = new Exam();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            M.rollNo = input.nextInt();
            M.s1 = input.nextInt();
            M.s2 = input.nextInt();
            M.s3 = input.nextInt();
            System.out.println(M.rollNo + M.avg());
        }

    }
}
// Exam module
class Exam{
    int rollNo;
    int s1;
    int s2;
    int s3;

    public double avg(){
        double average =( s1+s2+s3)/3.0;
        return average;
    }

}