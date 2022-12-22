public class MaxConsecutiveOne {
    static int consecutiveones(int arr[]){          
        int res=0;
        for(int i=0;i<arr.length;i++){
            int current=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==1)
                    current++;
                    else
                    break;
                
            }
            res=Math.max(current, res);
    }
    return res;
    }

    static int consecutiveones1(int arr[]){
        int res=0;
        int current=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            current=0;
            else
            current++;
            res=Math.max(res,current);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,0};
        int x = consecutiveones(arr);
        int y = consecutiveones1(arr);
        System.out.println(x);
        System.out.println(y);
    }
}
