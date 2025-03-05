//Backtracking problem

import java.util.Arrays;
import java.util.Scanner;

public class allStrings0toK {
    int[] A;

    public allStrings0toK(int n) {
        A = new int[n];
    }

    public void K_strings(int n, int k) {
        if (n <= 0) {
            System.out.println(Arrays.toString(A));
        } else {
            for (int j = 0; j <= k; j++) {
                A[n - 1] = j;
                K_strings(n - 1, k);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        allStrings0toK i = new allStrings0toK(n);
        i.K_strings(n, k);
        s.close();
    }
}
// O(k^n) time complexity