package assignment;

public class Program24 {
    public static void main(String[] args) {

        String[] subjects = {
            "Math", "English", "Nepali", "Computer", "Science"
        };

        int[] marks = {99, 80, 87, 88, 69};

        int total = 0;

        System.out.println("Subject\t\tMarks");
        System.out.println("----------------------");

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + "\t\t" + marks[i]);
            total += marks[i];
        }

        double percent = (double) total / subjects.length;

        System.out.println("----------------------");
        System.out.println("Total\t\t" + total);
        System.out.println("Percent\t\t" + percent + " %");
        System.out.println("----------------------");
    }
}
