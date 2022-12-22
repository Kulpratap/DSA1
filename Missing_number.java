import java.util.Arrays;

public class Missing_number {
    static int MissingNumber(int arr[], int n) {
        int sum = (n * (n + 1)) / 2;
        for (int i = 1; i < n; i++)
            sum -= arr[i-1];
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int x =MissingNumber(arr, 5);
        System.out.println(x);
    }
}
