    public class Prefix_Sum {
        static int prefixsum(int prefix_sum[], int l , int r){
            if(l!=0){
                return prefix_sum[r]-prefix_sum[l-1];
            }
            else{
                return prefix_sum[r];
            }
        }
        public static void main(String[] args) {
            int arr[]={2, 8, 3, 9, 6, 5, 4};
        
            int n=7;
            
            int ps[];
            ps = new int[n];
            
            ps[0] = arr[0];
            
            for(int i=1; i<n; i++)
                ps[i] = ps[i-1]+ arr[i];
            
            int x = prefixsum(ps, 1, 3);
            System.out.println(x);
        }
    }
    