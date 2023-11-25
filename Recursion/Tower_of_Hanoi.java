package Recursion;

public class Tower_of_Hanoi {

    // Tower of Hanoi
    public static void TowerOfHanoi(int n, String Source, String Helper, String Destination) {
        if (n == 1) {
            System.out.println("Transfer disc " + n + " from " + Source + " to " + Destination);
            return;
        }
        TowerOfHanoi(n - 1, Source, Destination, Helper);
        System.out.println("Transfer disc " + n + " from " + Source + " to " + Destination);
        TowerOfHanoi(n - 1, Helper, Source, Destination);

    }

    public static void main(String[] args) {
        // calling function
        TowerOfHanoi(2, "S", "H", "D");
    }
}
