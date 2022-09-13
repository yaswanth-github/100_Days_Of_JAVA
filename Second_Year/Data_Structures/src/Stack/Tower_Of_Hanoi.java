package Stack;

public class Tower_Of_Hanoi
{
    public static void  main(String args[])
    {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'B', 'C'); // A, B and C are names of rods
    }
    static void towerOfHanoi(int n, char PA, char PB, char PC)
    {
        if(n==0)
        {
            return;
        }
        if (n == 1)
        {
            System.out.println("Move disk "+ n + " from rod " +PA+" to rod " + PC );
        }
        else
        {
            towerOfHanoi(n - 1,PA,PC,PB);
            System.out.println("Move disk "+ n + " from rod " +
                    PA +" to rod " + PC );
            towerOfHanoi(n - 1, PB,PA,PC);
        }
    }
}