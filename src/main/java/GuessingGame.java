import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(20);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number: ");
        while(true){
            int container = scan.nextInt();

            if(container < number){
                System.out.println("The number you have picked is SMALLER than the actual number. Try again.");
            }else if(container > number){
                System.out.println("The number you have picked is BIGGER than the actual number. Try again.");
            }else{
                System.out.println("The number is correct. Congratulations!");
                break;
            }
        }
    }
}
