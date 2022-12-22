import java.util.*;
public class SubarrayWithGivenSum {
    static ArrayList<Integer> findArraywithsum(int arr[] , int sum){
        ArrayList<Integer> list= new ArrayList<Integer>();
        int n=arr.length;
        int curr_sum=arr[0];
        int s=0;
        for(int e=1;e<n;e++){
            while(curr_sum>sum &&s<e-1){
                curr_sum-=arr[s];
                s++;
            }
            if(curr_sum==sum)
            
                list.add(s);
                list.add(e-1);
                return list;
            
            if(e<n)
                curr_sum+=arr[e]; 
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        int sum=12;
        ArrayList<Integer> list= new ArrayList<Integer>();
    list = findArraywithsum(arr, sum);
    System.out.println(list);
        
    }
}
