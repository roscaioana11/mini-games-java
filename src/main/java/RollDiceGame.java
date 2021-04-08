import java.util.Scanner;

public class RollDiceGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int roll, playerTotal, computerTotal, turnTotal;
        String choice = "";

        playerTotal = 0;
        computerTotal = 0;

        do{
            turnTotal = 0;
            System.out.println("You have " + playerTotal + " points.");
            do{
                roll = 1 + (int)(Math.random() * 6);
                System.out.println("\tYou rolled a " + roll + ".");
                if(roll == 1){
                    System.out.println("\tThat ends your turn.");
                    turnTotal = 0;
                }else {
                    turnTotal += roll;
                    System.out.print("\tYou have " + turnTotal + " points");
                    System.out.print(" so far this round.\n");
                    System.out.print("\tWould you like to \"roll\" again");
                    System.out.print(" or hold \"hold\"? ");
                    choice = keyboard.next();
                }
            }while (roll != 1 && choice.equals("roll"));

            playerTotal += turnTotal;
            System.out.println("\tYou end the round with " + playerTotal + " points.");

            if(playerTotal < 100){
                turnTotal = 0;
                System.out.println("Computer has " + computerTotal + " points.");

                do{
                    roll = 1 + (int)(Math.random() * 6);
                    System.out.println("\tComputer rolled a " + roll + ".");
                    if(roll == 1){
                        System.out.println("\tThat ends its turn.");
                        turnTotal = 0;
                    }else {
                        turnTotal += roll;
                        System.out.print("\tComputer has " + turnTotal);
                        System.out.print(" points so far this round.\n");
                        if(turnTotal < 20 && ((computerTotal + turnTotal) < 100)){
                            System.out.println("\tComputer will roll again.");
                        }
                    }
                }while (roll != 1 && turnTotal < 20 && ((computerTotal + turnTotal) < 100));

                computerTotal += turnTotal;
                System.out.print("\tComputer ends the round with ");
                System.out.print(computerTotal + " points.\n");
            }
        }while (playerTotal < 100 && computerTotal <100);

        if(playerTotal > computerTotal){
            System.out.println("Player wins!");
        }else {
            System.out.println("Computer wins!");
        }
    }
}
