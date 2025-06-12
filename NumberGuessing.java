import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("👤 Enter your name: ");
        String playerName = scanner.nextLine();

        String playAgain;

        do {
            int userChoice;
            int aiChoice = random.nextInt(100) + 1;
            int numOfGuesses = 10;
            boolean isGuessed = false;

            System.out.println("🎲 Welcome, " + playerName + "! Let's Play Number Guess! 🎲");
            System.out.println("💡 You have 10 chances. Good Luck!");

            int attemptsUsed = 0;

            while (numOfGuesses != 0) {

                System.out.print("\n🎯 Enter your guess (1-100): ");
                userChoice = scanner.nextInt();

                if (userChoice < 1 || userChoice > 100) {
                    System.out.println("❗ Please enter a number between 1 and 100");
                    continue;
                }

                numOfGuesses--;
                attemptsUsed++;

                if (userChoice == aiChoice) {
                    System.out.println("🎉 You guessed correctly!");
                    System.out.println("📊 Attempts Used: " + attemptsUsed);
                    System.out.println("🏆 Score: " + (11 - attemptsUsed) * 10 + " points");
                    isGuessed = true;
                    break;
                }
                else if (aiChoice > userChoice) {
                    System.out.println("⬆️ Up");
                }
                else {
                    System.out.println("⬇️ Down");
                }

                System.out.println("❗ Remaining Guesses: " + numOfGuesses);
            }

            if (!isGuessed) {
                System.out.println("\n❌ Game Over, " + playerName + " 😢");
                System.out.println("🤖 The correct number was: " + aiChoice);
                System.out.println("🏆 Score: 0 points");
            }

            System.out.print("\n🔁 Do you want to play again? (y/n): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("👋🏻 Thanks for playing, " + playerName + "!");
        scanner.close();
    }
}