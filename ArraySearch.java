public class ArraySearch {
    static int linearSearch(int arr[], int x)
    {
         for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,87,89};
        int x = linearSearch(arr, 89);
        System.out.println("The element is at index "+x);
    }
}
