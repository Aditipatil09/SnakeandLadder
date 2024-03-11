import java.util.Scanner;


public class SimpleGame {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int playerPosition = 0;
        int winningPosition = 100;
        System.out.println("Welcome to the Simple Snake and ladder game:");

        while (playerPosition < winningPosition) {
            System.out.println("Current Position :" + playerPosition);
            System.out.println("Enter the numbers:");
            int move = scanner.nextInt();
            if (move < 0) {
                System.out.println("Enter a positive numbers:");
                continue;
            }
            playerPosition += move;
            if (playerPosition < 0) {
                playerPosition = 0;
                    System.out.println("Number restarted from position 0:");
            }
        }
        System.out.println("Congratulation you reached to winning position:");
        scanner.close();

    }
}
