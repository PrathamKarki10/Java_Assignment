package assignment;

import java.util.Arrays;

public class program1 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        String[] names = {"Banana", "Apple", "Mango", "Orange"};

        Arrays.sort(numbers);
        Arrays.sort(names);

        System.out.println("Sorted numeric array: " + Arrays.toString(numbers));
        System.out.println("Sorted string array: " + Arrays.toString(names));
    }
}
