import java.util.Random;
import java.util.Scanner;

/**
* Regula: calculatorul alege un nr aleatoriu(random) iar jucatorul incearca sa ghiceasca nr
* Dupa fiecare ghicire incorecta, calculatorul ii spune jucatorului daca nr generat este < sau > decat cel ghicit
 */
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
