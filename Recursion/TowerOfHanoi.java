public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }

    private static void towerOfHanoi(int n, char source, char aux, char dest) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, source, dest, aux);
        System.out.println("Move disk from " + source + " to " + dest);
        towerOfHanoi(n - 1, aux, source, dest);
    }
}
// O(2^n) time complexity