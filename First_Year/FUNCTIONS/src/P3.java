public class P3 {
    public static void main(String args[])
    {
        int[] votes = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
        int userWithMostVotes = mostVotes(votes);
        System.out.println("User with the most votes is User: " + userWithMostVotes);
    }

    // write the function mostVotes() here.
    public static int mostVotes(int[] n)
    {
        int i,max=0,m=0;
        for(i=0;i<n.length;i++)
        {
            if(max<n[i])
            {
                max=n[i];
                m=i;
            }
        }
        return m;
    }
}
