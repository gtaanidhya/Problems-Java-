public class isArraySorted {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 7, 6 };
        System.out.println(isArrayInSortedOrder(arr, arr.length));
    }

    private static boolean isArrayInSortedOrder(int[] arr, int index) {
        if (arr.length == 1 || index == 1) {
            return true;
        }
        return arr[index - 1] < arr[index - 2] ? false : isArrayInSortedOrder(arr, index - 1);
    }
}