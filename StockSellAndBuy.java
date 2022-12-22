public class StockSellAndBuy {
    static int SellandBuy(int arr[],int start, int end){
        if(end<=start){
            return 0;
        }
        int profit=0;
        for(int i=start;i<end;i++){
              for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                int current_profit=(arr[j]-arr[i])+ SellandBuy(arr,start,i-1)+SellandBuy(arr, j+1,end);
                profit=Math.max(profit, current_profit);
                }
              }
        }
        return profit;
    }
    static int maxprofit(int arr[]){
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,8,12};
        int x = SellandBuy(arr, 0, arr.length-1);
        int y = maxprofit(arr);
        System.out.println(x);
        System.out.println(y);
    }
}
