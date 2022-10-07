package HashTables;
import java.util.*;
public class Email_Q
{
    public static void main(String[] args)
    {
        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com","rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com","phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};

        String NewEmail="monica.geller@xyz.com";
        // Write your code here
        int l=0;
        for(int i=0;i<8;i++)
        {
            if(NewEmail == emails[i]){
                l=i;
            }
        }
        if(NewEmail == emails[l])
        {
            System.out.println(l);
        }
        else
        {
            System.out.println(-1);
        }
    }
}


