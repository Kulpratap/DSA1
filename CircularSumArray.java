public class CircularSumArray {
    static int circularsum(int arr[]){
        int n=arr.length;
        int res=arr[0];
        for(int i=0;i<n;i++){
            int current_sum=arr[i];
            int current_max=arr[i];
            for(int j=1;j<n;j++){
                int index=(i+j)%n;
                current_sum=current_sum+arr[index];
                current_max=Math.max(current_max, current_sum);
            }
            res=Math.max(current_max, res);
        }
        return res;             
    }

    static int maxsum(int arr[]){
        int n=arr.length;
        int res=0;
        int maxending=arr[0];
        for(int i=1;i<n;i++){
            maxending=Math.max(arr[i], arr[i]+maxending);
            res=Math.max(maxending, res);
        }
        return res;
    }
    static int circularsum1(int arr[]){
        int max_normalsum=maxsum(arr);
        if(max_normalsum<0)
        return max_normalsum;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            arr[i]=-arr[i];
        }
        int circular_sum=sum+maxsum(arr);
        return Math.max(max_normalsum, circular_sum);
        
    }
    public static void main(String[] args) {
        int arr[]={5,-2,3,4};
        int x = circularsum(arr);
        int y= circularsum1(arr);
        System.out.println(x);
        System.out.println(y);
    }
}
