package assignment;

public class Program5 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int search = 30;
        boolean found = false;

        for (int num : arr) {
            if (num == search) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Value found" : "Value not found");
    }
}
