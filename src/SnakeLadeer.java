import java.util.Random;
public class SnakeLadeer {
    public static void main(String args[]){
        int playerPosition =0;
        int targetPosition =100;
        System.out.println("Welcome to Snake and Ladder Game:");

        while (playerPosition <targetPosition) {
            int diceValue = rollDice();
            playerPosition = movePlayer(playerPosition , diceValue);
            playerPosition = checkForSnakeAndLadder (playerPosition);
            displayPlayerPosition(playerPosition);
        }
        System.out.println("Congrates ! you reached to target position:");
    }
    private static int rollDice(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }
    private static int movePlayer (int currentPosition, int diceValue)
    {
        return currentPosition +diceValue;
    }
    private static int checkForSnakeAndLadder(int currentPosition) {
        int[] snakePosition = {16, 47, 49, 56, 62, 64, 87, 93, 95, 98};
        int[] ladderStarts = {1, 4, 9, 21, 28, 36, 51, 71, 80};

        for(int snakePos : snakePosition){
            if(currentPosition ==snakePos){
                System.out.println("OOps Snake bite at position :" +currentPosition);
                return 0;
            }
        }
        for (int ladderStart : ladderStarts){
            if(currentPosition == ladderStart){
                System.out.println("Yay! Climbing a ladder positio:" +currentPosition);
                return currentPosition+10;
            }
        }
        return currentPosition;

    }
    private static void displayPlayerPosition(int position){
        System.out.println("Current Position:" +position);
    }

}
