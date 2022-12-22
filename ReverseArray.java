public class ReverseArray {
   static void reverseArray(int arr[]){
        int high=arr.length-1;
        int low = 0;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,5,7,30};
        System.out.println("Before Reversing");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        reverseArray(arr);
        System.out.println("\n After Reversing");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
