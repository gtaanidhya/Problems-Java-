package Arrays;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(reverseArrayWithExtraSpace(arr)));
        reverseArrayTwoPointers(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverseArrayWithExtraSpace(int[] arr) {
        int newArr[] = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
            newArr[i] = arr[j];
        }
        return newArr;
    }

    public static void reverseArrayTwoPointers(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
