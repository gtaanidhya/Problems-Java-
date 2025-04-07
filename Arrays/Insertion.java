/*ProblemStatement:We need to insert an element at a specified position b in the array by shifting the existing elements to the right.
->We start by checking if the given position b is valid. If it's less than 0 or greater than the array size, it's an invalid position.
->We then iterate through the array in reverse starting from the last element up to the position b. For each element, we shift it one position to the right.
->After creating space for the new element, we insert the new value at the specified position b.
*/
package Arrays;

public class Insertion {
    public static void insert(int[] arr, int b, int value) {
        if (b < 0 || b >= arr.length) {
            System.out.println("Invalid Position");
        }
        for (int i = arr.length - 2; i >= b; i--) {
            arr[i + 1] = arr[i];
        }
        arr[b] = value;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int b = 2;
        int newValue = 10;
        insert(arr, b, newValue);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
