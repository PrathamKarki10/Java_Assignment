package assignment;

public class Program15 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5};

        for (int x : a) {
            for (int y : b) {
                if (x == y) {
                    System.out.println(x);
                }
            }
        }
    }
}
