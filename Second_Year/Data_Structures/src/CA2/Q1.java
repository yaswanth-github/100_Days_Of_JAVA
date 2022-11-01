package CA2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1 {
    class Result {
        public static void main(String args[]){

        }

        /*
         * Complete the 'BuffaloLatin' function below.
         *
         * The function is expected to return an STRING.
         * The function accepts STRING s as parameter.
         *
         */
        static boolean isVowel(char ch){
            char A[]={'a','e','i','o','u'};
            char B[]={'A','E','I','O','U'};
            boolean res = false;
            for(int i=0;i<5;i++){
                if(ch==A[i]||ch==B[i]){
                    res=true;
                    break;
                }
            }
            return res;
        }


        public static String BuffaloLatin(String s) {

            String arr[]=s.split(" ");
            String ans="";
            int count=1;
            for(int i=0;i<arr.length;i++){
                String str=arr[i];
                int length=str.length();
                char ch=str.charAt(0);
                if(!isVowel(ch)){
                    ans += str.substring(1,length) +ch +"ma";
                }
                else{
                    ans +=str +"ma";
                }
                for(int j=0;j<count;j++)
                    ans +='a';
                ans +=" ";
                count++;
            }
            return ans;


        }
    }
}
