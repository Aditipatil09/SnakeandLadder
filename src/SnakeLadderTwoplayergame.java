import java.util.Scanner;

public class SnakeLadderTwoplayergame {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int winningPosition = 100;
            int[] playerPositions = {0, 0}; // Player 1 and Player 2 positions
            boolean[] ladderFlag = {false, false}; // Flags to check if a player got a ladder

            System.out.println("Welcome to the Two-Player Dice Game!");

            int currentPlayer = 0; // 0 for Player 1, 1 for Player 2

            while (playerPositions[currentPlayer] < winningPosition) {
                System.out.println("Player " + (currentPlayer + 1) + "'s turn");
                System.out.println("Current position: " + playerPositions[currentPlayer]);

                System.out.print("Enter the number to roll the dice: ");
                int diceResult = scanner.nextInt();

                if (diceResult < 1 || diceResult > 6) {
                    System.out.println("Invalid dice result. Please enter a number between 1 and 6.");
                    continue;
                }

                // Check for ladder
                if (diceResult == 6) {
                    ladderFlag[currentPlayer] = true;
                    System.out.println("Player " + (currentPlayer + 1) + " got a ladder! Roll again.");
                } else {
                    ladderFlag[currentPlayer] = false;
                    playerPositions[currentPlayer] += diceResult;
                }

                // Check for winning condition
                if (playerPositions[currentPlayer] < 0) {
                    playerPositions[currentPlayer] = 0;
                    System.out.println("Player " + (currentPlayer + 1) + " restarted from position 0.");
                } else if (playerPositions[currentPlayer] > winningPosition) {
                    playerPositions[currentPlayer] -= diceResult;
                    System.out.println("Invalid move. Player " + (currentPlayer + 1) + " needs an exact number to win.");
                }

                // Switch player if no ladder
                if (!ladderFlag[currentPlayer]) {
                    currentPlayer = (currentPlayer + 1) % 2;
                }
            }

            System.out.println("Player " + (currentPlayer + 1) + " won the game!");
            scanner.close();
        }
    }

