package assignment;

public class program2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}
