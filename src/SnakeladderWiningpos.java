import java.util.Scanner;

public class SnakeladderWiningpos {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int playerPosition = 0;
            int winningPosition = 100;

            System.out.println("Welcome to the Exact Winning Game!");

            while (playerPosition != winningPosition) {
                System.out.println("Current position: " + playerPosition);
                System.out.print("Enter the number to move forward: ");

                int move = scanner.nextInt();

                if (move < 0) {
                    System.out.println("Invalid move. Please enter a positive number.");
                    continue;
                }

                playerPosition += move;

                if (playerPosition < 0) {
                    playerPosition = 0;
                    System.out.println("Player restarted from position 0.");
                } else if (playerPosition > winningPosition) {
                    playerPosition -= move;
                    System.out.println("Invalid move. Try again to reach exactly 100.");
                }
            }

            System.out.println("Congratulations! You reached the exact winning position 100!");
            scanner.close();
        }
    }


