import java.util.Scanner;
public class ExactWinningGame {
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int playerPosition=0;
        int winningPosition=100;
        System.out.println("Welcome to tthe winning game:");

        while(playerPosition !=winningPosition){
            System.out.println("Current Positon :"+playerPosition);
            System.out.println("Enter the winnning number to move forward:");
            int move= scanner.nextInt();
            if(move<0){
                System.out.println("Invalid move Enter the Positive number:");
                continue;
            }
            playerPosition +=move;
            if(playerPosition<0){
                playerPosition=0;
                System.out.println("Player restarted from position 100:");
            }
            else if(playerPosition >winningPosition){
                playerPosition -=move;
                System.out.println("Invalid number! Try again to reach position 100");
            }
        }
        System.out.println("Congratulation! you reached to position target position:");
                scanner.close();

    }
}
