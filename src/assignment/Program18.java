package assignment;

public class Program18 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 2};

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                second = smallest;
                smallest = num;
            } else if (num < second && num != smallest) {
                second = num;
            }
        }

        System.out.println("Second smallest = " + second);
    }
}
