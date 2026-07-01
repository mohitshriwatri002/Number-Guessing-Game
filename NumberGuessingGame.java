import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        System.out.println("maine 1 se 100 ke beech ek number socha hai . Chalo game shuru karte hain!");
        while (userGuess != targetNumber) {
            System.out.println("type your guess: ");
            userGuess = scanner.nextInt();
            if (userGuess < targetNumber){
                System.out.println("Higher \n");
            }
            else if (userGuess > targetNumber){
                System.out.println("Lower \n");
            }
            else {
                System.out.println("Congratulation! you guessed correctly" + targetNumber);
            }
        }
        scanner.close();
    }
}
