public class MajorityElement {

    static int majorElement(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2)
                return i;
        }
        return -1;
    }
    static int majorElement1(int arr[]){
        int n=arr.length;
        int res=0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i])
            count++;
            else
            count--;
            if(count==0){
                res=i;
                count=1;
            }
        }
        count =0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i])
            count++;
        }
        if(count<=n/2)
        res=-1;
        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 8, 7, 6, 8, 6, 6, 6, 6 };
        int x = majorElement1(arr);
        System.out.print(x);
    }
}
