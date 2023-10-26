import java.util.Scanner;
import java.util.Random;

public class MultiplicationExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int score = 0;

            for (int x = 0; x < 10; x++) {
                int randomNumber1 = random.nextInt(10) + 1;
                int randomNumber2 = random.nextInt(10) + 1;
                int correctResult = randomNumber1 * randomNumber2;

                System.out.print("What is " + randomNumber1 + " x " + randomNumber2 + "? ");
                int userAnswer = scanner.nextInt();

                if (userAnswer == correctResult) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is " + correctResult);
                }
            }

            if (score == 10) {
                System.out.println("Congratulations! You scored 10 points!");
                break;
            } else {
                System.out.println("You didn't score 10 points. Let's try again!");
            }
        }
    }
}
