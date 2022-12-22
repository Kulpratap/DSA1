import java.lang.*;
public class MaximumSum {

    static int MaxSum(int arr[]){
        int res=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }
    static int MaxSum1(int arr[]){
        int res=arr[1]-arr[0];
        int minval=arr[0];
        for(int j=1;j<arr.length;j++){
            res=Math.max(arr[j]-minval, res);
            minval=Math.min(minval, arr[j]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30};
        int x = MaxSum1(arr);
        System.out.println(x);
    }
}
