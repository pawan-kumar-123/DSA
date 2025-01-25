// package Algorithm;

public class Binary_Search_Algorithm {
    public static int binary_Search(int arr[], int t) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (t < arr[m]) {
                s = m - 1;
            } else if (t > arr[m]) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 12, 13, 19, 23, 34, 56 };
        int t = 34;
        int ans = binary_Search(arr, t);
        System.out.println(ans);
    }
}
