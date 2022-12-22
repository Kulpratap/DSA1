import java.util.*;
public class SelectionSort {
    // Naive Approach that uses extra O(n) space but selection sort is inplace so this is
    // not a optimial solution for the selection sort:->
    static void Selection_Sort(int arr[]){
        int n=arr.length;
        int temp[]= new int[n];
        for(int i=0;i<n;i++){
            int  min_ind=0;
            for(int j=1;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }
            temp[i]=arr[min_ind];
            arr[min_ind]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    // efficient approach
    static void Selection_Sort1(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }
            int temp=arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,5,8,20,2,18};
        Selection_Sort(arr);
        System.out.println("After Sorting :");
        System.out.println(Arrays.toString(arr));
    }
}
