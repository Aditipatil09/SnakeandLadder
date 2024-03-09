import java.util.Random;

public class SnakeLadderGame {
    public static void main(String[] args) {
        int playerPosition = 0;
        int targetPosition = 100;

        System.out.println("Welcome to Snake and Ladder Game!");

        while (playerPosition < targetPosition) {
            int diceValue = rollDice();
            System.out.println("You rolled a " + diceValue);

            playerPosition = movePlayer(playerPosition, diceValue);
            playerPosition = checkForSnakeAndLadder(playerPosition);
            displayPlayerPosition(playerPosition);
        }

        System.out.println("Congratulations! reached the target position.");
    }

    // Simulate rolling a six-sided dice using Random
    private static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    // Move the player based on the dice value
    private static int movePlayer(int currentPosition, int diceValue) {
        return currentPosition + diceValue;
    }

    // Check for Snake or Ladder at the current position
    private static int checkForSnakeAndLadder(int currentPosition) {
        // Define snake and ladder positions (you can customize these)
        int[] snakePositions = {16, 47, 49, 56, 62, 64, 87, 93, 95, 98};
        int[] ladderStarts = {1, 4, 9, 21, 28, 36, 51, 71, 80};

        // Check for snake bite
        for (int snakePos : snakePositions) {
            if (currentPosition == snakePos) {
                System.out.println("Oops! Snake bite at position " + currentPosition);
                return 0; // Move back to position 0
            }
        }

        // Check for ladder climb
        for (int ladderStart : ladderStarts) {
            if (currentPosition == ladderStart) {
                System.out.println("Yay! Climbing a ladder from position " + currentPosition);
                return currentPosition + 10; // Move forward by 10 positions
            }
        }

        return currentPosition;
    }

    // Display the current position of the player
    private static void displayPlayerPosition(int position) {
        System.out.println("Current Position: " + position);
    }
}



