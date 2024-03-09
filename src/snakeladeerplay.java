import java.util.Random;


public class snakeladeerplay {


        public static void main(String[] args) {
            int playerPosition = 0;
            int targetPosition = 100;

            System.out.println("Welcome to Snake and Ladder Game!");

            while (playerPosition < targetPosition) {
                int diceValue = rollDice();
                System.out.println("You rolled a " + diceValue);

                int option = checkOption();
                playerPosition = movePlayer(playerPosition, diceValue, option);
                displayPlayerPosition(playerPosition);
            }

            System.out.println("Congratulations! You reached the target position.");
        }

        // Simulate rolling a six-sided dice using Random
        private static int rollDice() {
            Random random = new Random();
            return random.nextInt(6) + 1;
        }

        // Check for No Play, Ladder, or Snake using Random
        private static int checkOption() {
            Random random = new Random();
            return random.nextInt(3); // Generates a random number between 0 to 2 (inclusive)
        }

        // Move the player based on the option and dice value
        private static int movePlayer(int currentPosition, int diceValue, int option) {
            switch (option) {
                case 0:
                    System.out.println("No Play! You stay in the same position.");
                    break;
                case 1:
                    System.out.println("Yay! Ladder! You move ahead by " + diceValue + " positions.");
                    currentPosition += diceValue;
                    break;
                case 2:
                    System.out.println("Oops! Snake! You move behind by " + diceValue + " positions.");
                    currentPosition -= diceValue;
                    if (currentPosition < 0) {
                        currentPosition = 0; // Ensure the player doesn't go below position 0
                    }
                    break;
            }
            return currentPosition;
        }

        // Display the current position of the player
        private static void displayPlayerPosition(int position) {
            System.out.println("Current Position: " + position);
        }
    }


