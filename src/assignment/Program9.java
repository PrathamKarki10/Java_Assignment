package assignment;

import java.util.Arrays;

public class Program9 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50};
        int element = 30;
        int position = 2;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j++];
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}
