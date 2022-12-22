public class ArrayDeletion {
    // if postion is not given :
    static int Deletion(int n , int x , int arr[]){
        int i;
        for(i=0; i<n;i++){
        if(arr[i]==x)
        break;
        }
        if(i==n)
        return n;

        for(int j=i;j<n;j++){
        arr[j]=arr[j+1];}
        return (n-1);
    }

    public static void main(String[] args) {
        int arr[] ={3,8,12,5,6};
         System.out.println("Before Insertion : ");
         for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        Deletion(4, 5,2 ,arr);
         System.out.println("\nAfter Insertion : ");
         for(int i=0;i<arr.length-1;i++)
            System.out.print(arr[i]+" ");
         
    }
}
