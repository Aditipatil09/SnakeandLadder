import java.util.Scanner;

    public class DiceRollGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int playerPosition = 0;
            int winningPosition = 100;
            int diceRolls = 0;

            System.out.println("Welcome to the Dice Roll Game!");

            while (playerPosition != winningPosition) {
                System.out.println("Current position: " + playerPosition);
                System.out.print("Enter the number to roll the dice: ");

                int diceResult = scanner.nextInt();

                if (diceResult < 1 || diceResult > 6) {
                    System.out.println("Invalid dice result. Please enter a number between 1 and 6.");
                    continue;
                }

                playerPosition += diceResult;
                diceRolls++;

                if (playerPosition < 0) {
                    playerPosition = 0;
                    System.out.println("Player restarted from position 0.");
                } else if (playerPosition > winningPosition) {
                    playerPosition -= diceResult;
                    System.out.println("Invgalid move. Try again to reach exactly 100.");
                }

                System.out.println("Dice rolled: " + diceResult);
            }

            System.out.println("Congratulations! You reached the exact winning position 100 in " + diceRolls + " dice rolls!");
            scanner.close();
        }
    }

