package JavaQuestions;

public class Linear_Search {
    public static void main(String[] args) {
        int[] d = { 34, 5, 645, 32, 64, 96, 324, 2, 3, 9, 0 };
        int key = 2;
        for (int i = 0; i < d.length; i++) {
            if (d[i] == key) {
                System.out.println("Element found at index :- " + i);
                return;
            }
        }
        System.out.println(-1);
    }
}
