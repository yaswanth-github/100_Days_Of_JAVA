package Stack;

public class LinearSearch {
    public static void main(String args[]){
        int[] arr=new int[]{10,12,24,30};
        int x=24;
        int n=arr.length;
        int r=LinearSearch(arr,x);
        if(r==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at Index " + r);
        }
    }
    public static int LinearSearch(int[] arr, int x)
    {
        for (int i=0;i<arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}