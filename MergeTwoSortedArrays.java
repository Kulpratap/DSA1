import java.util.Arrays;

public class MergeTwoSortedArrays {
    // Naive Approach which uses extra O(n) space:->
    static void TwoArraySort(int arr[], int arr1[]){
        int m=arr.length;
        int n=arr1.length;
        int c[]= new int[m+n];
        for(int i=0;i<m;i++){
            c[i]=arr[i];
        }
        for(int j=0;j<n;j++){
            c[j+m]=arr1[j];
        }
        Arrays.sort(c);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
    // Efficient Approach ->
    static void TwoArraySort1(int arr[], int arr1[]){
        int m=arr.length;
        int n=arr1.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(arr[i]<=arr1[j]){
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.print(arr1[j]+" ");
            }
            while(i<m){
                System.out.print(arr[i]+" ");
            }
            while(j<n){
                System.out.print(arr[j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5};
        int arr1[]={5,6,6,15};
        TwoArraySort(arr, arr1);
    }
}
