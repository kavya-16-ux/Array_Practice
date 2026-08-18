
import java.util.Scanner;

public class P5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read the array
        System.out.println("Enter the array elements:");
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Read target and replacement
        System.out.println("Enter the target element");
        int target = scanner.nextInt();
        System.out.println("Enter the replace element:");
        int replacement = scanner.nextInt();
        int position = 0;
        // Replace matches, count changes and display the result
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (target == numbers[i]) {
                numbers[i] = replacement;
                position++;
            }
        }
        System.out.println("Changes: " + position);
        System.out.print("Updated array: ");
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
