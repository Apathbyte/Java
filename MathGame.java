import java.util.Random;
import java.util.Scanner;

public class MathGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 5; // Number of rounds

        System.out.println("Welcome to the Random Math Number Game!");
        System.out.println("You will be given math problems to solve.");
        System.out.println("Let's begin!\n");

        int correctCount = 0;

        for (int round = 1; round <= rounds; round++) {
            int num1 = random.nextInt(10) + 1; // Random number between 1 and 10
            int num2 = random.nextInt(10) + 1;
            int operation = random.nextInt(4); // 0: addition, 1: subtraction, 2: multiplication, 3: division
            char operator = ' ';

            switch (operation) {
                case 0:
                    operator = '+';
                    break;
                case 1:
                    operator = '-';
                    break;
                case 2:
                    operator = '*';
                    break;
                case 3:
                    operator = '/';
                    break;
            }

            System.out.printf("Round %d: What is %d %c %d? ", round, num1, operator, num2);
            int userAnswer = scanner.nextInt();

            int correctAnswer = 0;
            switch (operation) {
                case 0:
                    correctAnswer = num1 + num2;
                    break;
                case 1:
                    correctAnswer = num1 - num2;
                    break;
                case 2:
                    correctAnswer = num1 * num2;
                    break;
                case 3:
                    correctAnswer = num1 / num2;
                    break;
            }

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!\n");
                correctCount++;
            } else {
                System.out.println("Wrong! The correct answer is " + correctAnswer + "\n");
            }
        }

        System.out.println("Game over! You got " + correctCount + " out of " + rounds + " correct.");
        scanner.close();
    }
}