public class LargestElementInArray {
    static int findLargest(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag == true)
                return i;
        }
        return -1;
    }

    static int getLargest(int arr[]) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 20, 10 };
        int x = findLargest(arr);
        int y = getLargest(arr);
        System.out.println(arr[y]);
        System.out.println("The largest element in array " + arr[x]);
    }
}
