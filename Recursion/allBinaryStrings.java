import java.util.Arrays;

public class allBinaryStrings {
    int[] A;

    public allBinaryStrings(int n) {
        A = new int[n];
    }

    public void binary(int n) {
        if (n <= 0) {
            System.out.println(Arrays.toString(A));
        } else {
            A[n - 1] = 0;
            binary(n - 1);
            A[n - 1] = 1;
            binary(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        allBinaryStrings i = new allBinaryStrings(n);
        i.binary(n);
    }
}

