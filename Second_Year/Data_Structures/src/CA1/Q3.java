package CA1;
// Java code to demonstrate Divide and
// Conquer Algorithm
public class Q3 {
    // Function to find the maximum no.
    // in a given array.
    static int DNC_Max(int a[], int index, int l)
    {
        int max;
        if(l - 1 == 0)
        {
            return a[index];
        }
        if (index >= l - 2)
        {
            if (a[index] > a[index + 1])
                return a[index];
            else
                return a[index + 1];
        }

        // Logic to find the Maximum element
        // in the given array.
        max = DNC_Max(a, index + 1, l);

        if (a[index] > max)
            return a[index];
        else
            return max;
    }

    // Function to find the minimum no.
    // in a given array.
    static int DNC_Min(int a[], int index, int l)
    {
        int min;
        if(l - 1 == 0)
        {
            return a[index];
        }
        if (index >= l - 2)
        {
            if (a[index] < a[index + 1])
                return a[index];
            else
                return a[index + 1];
        }

        // Logic to find the Minimum element
        // in the given array.
        min = DNC_Min(a, index + 1, l);

        if (a[index] < min)
            return a[index];
        else
            return min;
    }

    // Driver Code
    public static void main(String args[])
    {

        // Defining the variables
        int min, max;

        // Initializing the array
        int a[] = { 12,20,30,130,190,30,39 };

        // Recursion - DAC_Max function called
        max = DNC_Max(a, 0, 7);

        // Recursion - DAC_Max function called
        min = DNC_Min(a, 0, 7);

        System.out.printf("The minimum number in a given array is : %d\n", min);
        System.out.printf("The maximum number in a given array is : %d", max);
    }

}