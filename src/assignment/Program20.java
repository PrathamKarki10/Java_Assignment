package assignment;

public class Program20 {
    public static void main(String[] args) {
        double[] price = {250, 300, 150, 400, 275, 320, 180, 500, 220, 350};
        double total = 0;

        for (double p : price) {
            total += p;
        }

        double avg = total / price.length;

        System.out.println("Total price = " + total);
        System.out.println("Average price = " + avg);
    }
}
