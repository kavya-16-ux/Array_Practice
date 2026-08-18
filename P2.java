
import java.util.Scanner;

class ScoreEditor {

    void correctScore(int[] scores, int index, int newScore) {
        // Validate the index and update the score
        if (index >= 0 && index < scores.length) {
            scores[index] = newScore;
        } else {
            System.out.println("Invalid index");
        }
    }

    void displayScores(int[] scores) {
        // Print all scores
        System.out.print("Scores: ");
        for (int i = 0; i <= scores.length - 1; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}

public class P2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");

        int size = scanner.nextInt();
        int[] scores = new int[size];
        System.out.println("Enter the array elements:");
        for (int index = 0; index < scores.length; index++) {
            scores[index] = scanner.nextInt();
        }
        System.out.println("Enter the correction index number:");
        int correctionIndex = scanner.nextInt();
        System.out.println("Enter the new score to update");
        int newScore = scanner.nextInt();

        // Create one ScoreEditor object
        ScoreEditor editor = new ScoreEditor();
        // Correct the score and display the array
        editor.correctScore(scores, correctionIndex, newScore);
        editor.displayScores(scores);

    }
}
