public class linear_search {

        public static void main(String args[])
        {
            int arr[]={1,5,7,8,0,3};
            int target =8;
            int ans=searchLinear(arr,target);
            if(ans!=-1)
            {
                System.out.println("the element is presnt at index " + ans);
            }
            else
            {
                System.out.println("element not found");
            }
        }
        public static int searchLinear(int[] arr,int target)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==target)
                {
                    return i;
                }
            }
            return -1;
        }
    }

