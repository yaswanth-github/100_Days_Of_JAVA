package JAVA_CA2.com;

public class S1Q3 {
        public static void main(String args[]){

            String originalStriing = "abcdcda";
            StringBuilder strBuilder = new StringBuilder(originalStriing);
            String reverseString = String.valueOf(strBuilder.reverse());
            String data = strBuilder.toString();
            if(originalStriing.equals(data)){
                System.out.println("IsPalindrome");
            }else{
                System.out.println("IsNotPalindrome");
            }
        }
}
