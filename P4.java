
import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read the array
        System.out.println("Enter the elements of array:");
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Read the target
        System.out.println("Enter the target element:");
        int target = scanner.nextInt();
        int res = -1;
        // Find and display the first matching index
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == target) {
                res = i;
                break;
            }
        }
        System.out.println("First index: " + res);
    }
}
