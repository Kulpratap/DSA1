public class MaxEvenOddArray{
    static int maxEvenOdd(int arr[]){
        int res=1;
        for(int i=0;i<arr.length;i++){
            int current=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]%2==0 && arr[j-1]%2!=0 ||arr[j]%2!=0 && arr[j-1]%2==0){
                    current++;
                }
                else 
                break;
            }
            res=Math.max(res,current);
        }
        return res;
    }
    static int maxEvenOdd1(int arr[]){
        int res=1;
        int current=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]%2==0 && arr[i-1]%2!=0 ||arr[i]%2!=0 && arr[i-1]%2==0){
                current++;
                res=Math.max(res, current);
            }
            else 
            current=1;
        }
        return res;   
    }
    
    public static void main(String[] args) {
        int arr[]={5,10,20,6,3,8};
        int x = maxEvenOdd(arr);
        int y = maxEvenOdd1(arr);
        System.out.println(x);
        System.out.println(y);

    }
}