package JAVA_CA2.com;

public class S1Q4 {
    public static void main(String s[])
    {
        int number = 5;
        int FindAnswer = 1;
        for(int i = 2; i <= number; i++ )
        {
            FindAnswer *= FindAnswer;
        }
        System.out.println("FindAnswer of 5 is " + FindAnswer);
    }
}
