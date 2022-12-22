import java.util.*;
public class Leader {
   static void leader(int arr[]){
    for(int i=0;i<arr.length;i++){
        boolean flag = false;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<=arr[j])
            flag=true;
        }
        if(flag==false)
        System.out.print(arr[i]+" ");
    }
   }
   static ArrayList<Integer> leaders(int arr[], int n){
    ArrayList<Integer> array = new ArrayList<Integer>();
    int current_leader=arr[n-1];
    array.add(arr[n-1]);
    for(int i=n-2;i>=0;i--){
        if(current_leader<=arr[i]){
            current_leader=arr[i];
            array.add(current_leader);
        }
    }
     Collections.reverse(array);
    return (array);
}
   
    public static void main(String[] args) {
        int arr[]={17,8,8,16 ,17 ,3 ,5 ,17};
        leader(arr);
    }
}
