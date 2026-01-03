package assignment;

public class Program14 {
    public static void main(String[] args) {
        String[] a = {"Apple", "Banana", "Mango"};
        String[] b = {"Banana", "Orange", "Apple"};

        for (String x : a) {
            for (String y : b) {
                if (x.equals(y)) {
                    System.out.println(x);
                }
            }
        }
    }
}
