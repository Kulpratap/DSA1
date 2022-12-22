public class QuickSort {
    void swap(int arr[],int a , int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    int partition(int arr[] , int l , int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<=pivot){
                i++; 
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return (i+1);
    }
    void qsort(int arr[] , int l , int h){
        if(l<h){
            int p=partition(arr, l, h);
            qsort(arr, l, p-1);
            qsort(arr, p+1, h);

        }
    }
    void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        QuickSort s = new QuickSort();
        int arr[]={12,34,56,78,98,67,9};
        s.qsort(arr,0,arr.length-1);
        s.printarray(arr);
    }
}
