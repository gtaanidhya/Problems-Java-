/*You are given an array arr of integers. Your task is to push all the zeros in the array to the end while maintaining the order of non-zero elements. */

package Arrays;

import java.util.Arrays;

public class PushZerosToEnd {
    public static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = 0;
        while (right < n) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 0, 5 };
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
