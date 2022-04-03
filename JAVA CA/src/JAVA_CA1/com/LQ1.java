package JAVA_CA1.com;

import java.util.Scanner;

public class LQ1 {
    public static void main(String args[]){

        Exam1 M1 = new Exam1();
        Exam1 M2 = new Exam1();
        Exam1 M3 = new Exam1();
        Exam1 M4 = new Exam1();
        Exam1 M5 = new Exam1();
        Scanner input = new Scanner(System.in);

        // Marks for Student1
        M1.rollNo = input.nextInt();
        M1.s1 = input.nextInt();
        M1.s2 = input.nextInt();
        M1.s3 = input.nextInt();
        System.out.println( "Roll No."+M1.rollNo+" " +"Average"+ M1.avg());

        // Marks for Student2
        M2.rollNo = input.nextInt();
        M2.s1 = input.nextInt();
        M2.s2 = input.nextInt();
        M2.s3 = input.nextInt();
        System.out.println(M2.rollNo + M2.avg());

        // Marks for Student3
        M3.rollNo = input.nextInt();
        M3.s1 = input.nextInt();
        M3.s2 = input.nextInt();
        M3.s3 = input.nextInt();
        System.out.println(M3.rollNo + M3.avg());

        // Marks for Student4
        M4.rollNo = input.nextInt();
        M4.s1 = input.nextInt();
        M4.s2 = input.nextInt();
        M4.s3 = input.nextInt();
        System.out.println(M4.rollNo + M4.avg());

        // Marks for Student1
        M5.rollNo = input.nextInt();
        M5.s1 = input.nextInt();
        M5.s2 = input.nextInt();
        M5.s3 = input.nextInt();
        System.out.println(M5.rollNo + M5.avg());
    }
}
// Exam module
class Exam1{
    int rollNo;
    int s1;
    int s2;
    int s3;

    public double avg(){
        double average =( s1+s2+s3)/3.0;
        return average;
    }

}
