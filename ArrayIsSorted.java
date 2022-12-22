public class ArrayIsSorted {
    // Naive Method:
    static boolean issorted(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])
                 return false;
            } 
        }
        return true;
    }
    static boolean issorted1(int arr[]){
         for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
         }
         return true;
    }

        public static void main(String[] args) {
            int arr[]={5,6,7,8};
            boolean x = issorted(arr);
            System.out.println(x);
            boolean y = issorted1(arr);
            System.out.println(y);
        }
    }
