public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'C', 'B');
    }

    private static void towerOfHanoi(int n, char source, char dest, char aux) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, source, aux, dest);
        System.out.println("Move disk from " + source + " to " + dest);
        towerOfHanoi(n - 1, aux, dest, source);
    }
}