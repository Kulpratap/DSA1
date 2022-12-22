public class LeftRotateByN {
    //Naive Approach:- Time Complexity : O(n*d), and Auxilary space : O(1):
    static void leftshiftbyn(int arr[],int d){
        for(int i=0;i<d;i++){
         int x = arr[0];
            int n = arr.length;
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=x;
    }
}
//Better Approach:- Time Complexity : O(n), and Auxilary space : O(d):
    static void leftshiftbyn1(int arr[],int d){
        int temp[]=new int[d];
        int i,n=arr.length;
        for( i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        
        for(i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        for(i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
    }
    static void reverseArray(int arr[],int low , int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    // Best Approach:- Time Complexity : O(n), and Auxilary space : O(1):
    static void leftshiftbyn2(int arr[],int d ){
        reverseArray(arr,0,d-1);
        reverseArray(arr, d,arr.length-1);
        reverseArray(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,80};
        int d=2;
        // leftshiftbyn(arr,d);
        //  leftshiftbyn1(arr,d);
         leftshiftbyn2(arr,d);

        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }

}
