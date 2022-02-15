public class largest_in_array {

    public static void main(String[] args)
    {
        int arr[]={10,30,100,40,70};
        largest(arr);
    }
    public static void largest(int[] arr)
    {
        int maximum=arr[0]; //first maximum elelement

        for(int i=1 ;i<arr.length;i++)
        {
// Compare current element and maximum element
            if(arr[i]>maximum)
            {
                maximum=arr[i];
            }
        }
        System.out.println("the largest element in the array is "+ maximum);
    }
}