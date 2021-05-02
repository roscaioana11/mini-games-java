import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner pick = new Scanner(System.in);
        String[] listOfWords = new String[]{"Squirtle", "Charmander", "Cyndaquil", "Cicorita", "Pikachu"};
        char[] missedLetters = new char[26];
        int missedLetterLength = 0;

        Random random = new Random();
        String pickedWord = listOfWords[random.nextInt(5)].toLowerCase(Locale.ROOT);

        int tries = 0;
        String guessedWord = "";
        for(int i = 0; i < pickedWord.length(); i++){
            guessedWord = guessedWord + "_";
        }

        while(!guessedWord.equals(pickedWord) && tries < 6){
            for(int i = 0; i < guessedWord.length(); i++){
                System.out.print(guessedWord.charAt(i) + " ");
            }
            System.out.println();
            System.out.println("Tries: " + tries + " / 6");
            System.out.print("Missed: ");
            for(int i = 0; i < missedLetterLength; i++){
                System.out.print(missedLetters[i]);
            }
            System.out.println();
            System.out.print("Enter a Letter: ");

            String letter = pick.next();
            if(letter.length() == 1){
                boolean newLetter = true;
                for(int i = 0; i < missedLetterLength; i++){
                    if(missedLetters[i] == letter.charAt(0)){
                        newLetter = false;
                    }
                }
                if(newLetter == true && guessedWord.indexOf(letter.charAt(0)) == -1){
                    char[] guessWordList = guessedWord.toCharArray();
                    for(int i = 0; i < pickedWord.length(); i++){
                        if(pickedWord.charAt(i) == letter.charAt(0)){
                            guessWordList[i] = pickedWord.charAt(i);
                        }
                    }
                    if(guessedWord.equals(new String(guessWordList))){
                        tries = tries + 1;
                        missedLetters[missedLetterLength] = letter.charAt(0);
                        missedLetterLength = missedLetterLength +1;
                    }else {
                        guessedWord = new String(guessWordList);
                    }
                }else {
                    System.out.println("You have already used this letter!");
                }
            }else {
                System.out.println("Please pick only ONE letter!");
            }
        }

        if(pickedWord.equals(guessedWord)){
            System.out.println("You Won!");
        }else {
            System.out.println("You Lost!");
        }
    }
}