import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int result=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number ::");
       int number1 = input.nextInt();
        System.out.println("Enter second number ::");
       int number2 = input.nextInt();
       System.out.println("Choose an operator: +, -, *, or / ::");
       char opp = input.next().charAt(0);
       switch (opp){
           case '+':
               result=number1+number2;
               break;
           case '-':
               result=number1-number2;
               break;
           case '*':
               result=number1*number2;
               break;
           case '/':
               result=number1/number2;
               break;
           default:
               System.out.println("Enter a Valid input");
       }
        System.out.println("The result is"+result);

    }
}
