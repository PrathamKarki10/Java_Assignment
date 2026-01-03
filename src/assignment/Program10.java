package assignment;

public class Program10 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 40, 2};

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
