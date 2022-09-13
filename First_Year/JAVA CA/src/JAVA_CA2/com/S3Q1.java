package JAVA_CA2.com;

import java.util.Scanner;

public class S3Q1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The full Name ::");
        String name=input.nextLine();
        System.out.print("Initials with surname is : ");
        int len = name.length();
        name = name.trim();
        String str1 = "";
        for (int i = 0; i < len; i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                str1 = str1 + ch;
            } else {
                System.out.print(Character.toUpperCase(str1.charAt(0)) + ". ");
                str1 = "";
            }
        }
        String str2 = "";
        for (int j = 0; j < str1.length(); j++) {
            if (j == 0) {
                str2 = str2 + Character.toUpperCase(str1.charAt(0));
            }
            else {
                str2 = str2 + Character.toLowerCase(str1.charAt(j));
            }
        }
        System.out.println(str2);
    }
}
