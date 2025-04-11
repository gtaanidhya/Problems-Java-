/*You are given an array arr of integers and an integer x. Your task is to rotate the array by x positions either to the left or to the right. */
package Arrays;

import java.util.Arrays;

public class ArrayRotation {
    public static int[] rotateRight(int[] arr, int x) {
        int n = arr.length;
        int[] roattedArr = new int[n];
        x = x % n;
        for (int i = 0; i < n; i++) {
            roattedArr[(i + x) % n] = arr[i];
        }
        return roattedArr;
    }

    public static int[] rotateleft(int[] arr, int x) {
        int n = arr.length;
        int[] roattedArr = new int[n];
        x = x % n;
        for (int i = 0; i < n; i++) {
            roattedArr[(i - x + n) % n] = arr[i];
        }
        return roattedArr;
    }

    public static void rotateRightOptimal(int[] arr, int x) {
        rotateArray(arr, 0, arr.length - 1);
        rotateArray(arr, 0, x - 1);
        rotateArray(arr, x, arr.length - 1);
    }

    public static void rotateLeftOptimal(int[] arr, int x) {
        rotateArray(arr, 0, arr.length - 1);
        rotateArray(arr, 0, arr.length - x - 1);
        rotateArray(arr, arr.length - x, arr.length - 1);
    }

    public static void rotateArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        if (n <= 1) {
            return;
        }
        if (k > n) {
            k = n;
        }

        rotateArray(nums, 0, n - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(rotateRight(arr, 2)));
        System.out.println(Arrays.toString(rotateleft(arr, 2)));
        rotateRightOptimal(arr, 2);
        System.out.println(Arrays.toString(arr));
        rotateLeftOptimal(arr1, 2);
        System.out.println(Arrays.toString(arr1));
    }
}
