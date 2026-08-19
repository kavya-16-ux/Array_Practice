
import java.util.Scanner;

public class P6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of classes:");
        int classes = scanner.nextInt();
        System.out.println("Enter the number of days:");
        int days = scanner.nextInt();
        int[][] attendance = new int[classes][days];

        // Read the matrix
        System.out.println("Enter the array elements:");
        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < days; j++) {
                attendance[i][j] = scanner.nextInt();
            }
        }
        // Calculate and display one total for every day
        for (int i = 0; i < days; i++) {
            int total = 0;
            for (int j = 0; j < classes; j++) {
                total += attendance[j][i];
            }
            System.out.println("Day " + (i + 1) + " total: " + total);
        }
    }
}
