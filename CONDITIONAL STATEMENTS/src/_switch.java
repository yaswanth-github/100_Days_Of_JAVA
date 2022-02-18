import java.util.Scanner;

public class _switch {
    public static void main(String[] args) {

        int n;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number from 1 to 4");
        n=input.nextInt();
        switch (n) {
            case 1 -> System.out.println("Hufflepuff");
            case 2 -> System.out.println("Gryffindor");
            case 3 -> System.out.println("Slytherin");
            case 4 -> System.out.println("Ravenclaw");
            default -> System.out.println("entered input is wrong");
        }
    }
}
