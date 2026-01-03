package assignment;

import java.util.Arrays;

public class Program7 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int remove = 30;

        int[] newArr = new int[arr.length - 1];
        int index = 0;

        for (int num : arr) {
            if (num != remove) {
                newArr[index++] = num;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}
