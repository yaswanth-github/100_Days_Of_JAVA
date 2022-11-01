package HashTables;
import java.io.*;
import java.util.*;


public class Elements_Contiguous {

    public static void main(String args[]){
        int arr[]={5,2,3,6,4,4,6,6};
        int n = arr.length;

        if(areElementsContiguous(arr,n)){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
    static Boolean areElementsContiguous(int arr[], int n){
        HashSet<Integer> us = new HashSet<Integer>();
        for(int i =0;i<n;i++){
            us.add(arr[i]);
        }
        int count=1;
        int curr_ele=arr[0] -1;
        while (us.contains(curr_ele) == true){
            count++;
            curr_ele--;
        }
        curr_ele=arr[0]+1;

        return null;
    }
}
