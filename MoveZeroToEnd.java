public class MoveZeroToEnd{
   static void movezeros(int arr[]){
    int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
            
        }
        while(count<arr.length){
            arr[count++]=0;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,10,10,10,0,0,0,4,0,9,8};
        movezeros(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
