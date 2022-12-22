    public class LeftRotate {
        static void leftshift(int arr[]){
            int x = arr[0];
            int n = arr.length;
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=x;
        }
        public static void main(String[] args) {
            int arr[]={10,20,30,40,80};
            leftshift(arr);
            for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        }
    }
    