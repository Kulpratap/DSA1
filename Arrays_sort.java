import java.util.*;
class Arrays_sort{
    public static void main(String[] args) {
        Integer arr[]={34,56,2,98,766,12};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // sorting from specific index:->
        // Arrays.sort(arr, 0 , 4);
        // System.out.println(Arrays.toString(arr));
        // reverse order
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}