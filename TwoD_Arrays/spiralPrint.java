/*
For a given two-dimensional integer array/list of size(N x M),print it in a spiral form.That is,you need to print in the order followed for every iteration:

a.First row(left to right)
b.Last column(top to bottom)
c.Last row(right to left)
d.First column(bottom to top)
*/
package TwoD_Arrays;

public class spiralPrint {
    public static void printSpiral(int[][] arr) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return;
        }
        int left = 0;
        int top = 0;
        int bottom = arr.length - 1;
        int right = arr[0].length - 1;

        while (left <= right || top <= bottom) {
            if (top <= bottom) {
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i] + " ");
                }
            }
            top++;
            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    System.out.print(arr[i][right] + " ");
                }
            }

            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
            }

            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
            }

            left++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 12, 13, 14, 5 },
                { 11, 16, 15, 6 },
                { 10, 9, 8, 7 } };
        // int[][] arr = {};
        printSpiral(arr);
    }
}
