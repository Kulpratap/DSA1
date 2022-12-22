class ArrayInsertion{
    static int insert(int x ,int n , int arr[] , int cap , int pos){
        if(n==cap)
        return n;
        int index=pos-1;
        for(int i=n-1;i>=index;i--)
            arr[i+1]=arr[i];
        arr[index]=x;
        return(n+1);
    }
    public static void main(String[] args) {
         int arr[] ={5,7,10,20,0};
         System.out.println("Before Insertion : ");
         for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
         
         insert(3, arr.length-1, arr, 10, 2);
         System.out.println("\nAfter Insertion : ");
         for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
         
    }
}