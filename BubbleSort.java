import java.util.Arrays;

public class BubbleSort {
    // This Function always run and time complexity -O(n^2):
        static void Bubble_Sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        for(int j=0;j<n-i-1;j++)
        if(arr[j]>arr[j+1]){
            int temp;
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }

    //This function is not run on O(n2) time complexity if it is already ready then it works on linear time 
    // Bubble sort is stable algo as it maintained the original postion of same element;
    // Bubble sort is In-Place algo as it does not make any change into its original array;
    
    static void Bubble_Sort1(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
        for(int j=0;j<n-i-1;j++)
        if(arr[j]>arr[j+1]){
            int temp;
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            swapped=true;
        }
        if(swapped==false)
        break;
    }

    }
    public static void main(String[] args) {
        int arr[]={10,8,20,5};
        System.out.println("Before Sorting :");
        System.out.println(Arrays.toString(arr));
        Bubble_Sort(arr);
        System.out.println("After Sorting :");
        System.out.println(Arrays.toString(arr));
        System.out.println("Before Sorting :");
        System.out.println(Arrays.toString(arr));
        Bubble_Sort1(arr);
        System.out.println("After Sorting :");
        System.out.println(Arrays.toString(arr));
    }
}
