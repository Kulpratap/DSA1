import java.util.*;
public class Insertion_sort{
   static void Insertionn_sort(int arr[]){
    int n=arr.length;
    for(int i=1;i<n;i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
   }
    public static void main(String[] args){
        int arr[]={10,23,56,43,32,78};
        Insertionn_sort(arr);
        System.out.println("After Sorting :");
        System.out.println(Arrays.toString(arr));
    }
}
