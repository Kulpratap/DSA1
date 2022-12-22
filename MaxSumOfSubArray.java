    class MaxSumOfSubArray{
        static int maxSum(int arr[]){
            int res=0;
            for(int i=0;i<arr.length;i++){
                int current=0;
                for(int j=i;j<arr.length;j++){
                    current=current+arr[j];
                    res=Math.max(res,current);
                }
            }
            return res;
        }
        static int maxSum1(int arr[]){
            int res=0;
            int maxending=arr[0];
            for(int i=0;i<arr.length;i++){
                maxending=Math.max(maxending+arr[i], arr[i]);
                res=Math.max(maxending, res);
            }
            return res;
        }
        public static void main(String[] args) {
            int arr[]={1,-2,3,-1,2};
            int x = maxSum(arr);
            int y = maxSum1(arr);
            System.out.println(x);
            System.out.println(y);
        }
    }