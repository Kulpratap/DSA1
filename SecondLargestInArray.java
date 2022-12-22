public class SecondLargestInArray {
    static int largest(int arr[]) {
        int res = 0;
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }

    static int SecondLargest(int arr[]) {
        int n = arr.length;
        int Largest = largest(arr);
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[Largest]) {
                if (res == -1)
                    res = i;
                else if (arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }

    static int SecondLargest1(int arr[]) {
        int largest = 0;
        int res = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 20, 10, 12 };
        int x = largest(arr);
        System.out.println(x);
        int y = SecondLargest(arr);
        System.out.println(y);
        int z = SecondLargest1(arr);
        System.out.println(z);
    }
}
