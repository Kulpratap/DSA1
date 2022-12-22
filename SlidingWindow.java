public class SlidingWindow {
    static int Slidingwin(int arr[], int k){
        int n=arr.length;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i+k-1<n;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum+=arr[i+j];
                max_sum=Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
    static int Slidingwin1(int arr[], int k){
        int n=arr.length;
        int curr_sum=0;
        for(int i=0;i<k;i++){
            curr_sum+=arr[i];
        }
        int max_sum=curr_sum;
        for(int i=k;i<n;i++){
            curr_sum+=arr[i]-arr[i-k];
            max_sum=Math.max(max_sum, curr_sum);
        }
        return max_sum;
    } 
    public static void main(String[] args) {
        int arr[]={1,8,30,-5,20,7};
        int x = Slidingwin(arr,3);
        int y= Slidingwin1(arr, 3);
        System.out.println(y);
        System.out.println(x);        
    }
}
