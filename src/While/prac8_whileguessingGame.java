package While;

import java.util.Random;
import java.util.Scanner;

public class prac8_whileguessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numToGuess = random.nextInt(100)+1;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        while (true){
        if(!scanner.hasNextInt()){
            System.out.println("Enter a Integer");
            scanner.next();
            continue;
        }
        int guess = scanner.nextInt();
        attempts++;
        if(guess<1||guess>100){
            System.out.println("Enter value between 1 to 100");
            continue;
        }
        if (guess<numToGuess){
            System.out.println("Too low");
        } else if (guess>numToGuess) {
            System.out.println("Too high");
        }
        else {
            System.out.println("correct, you guessed in "+attempts+" attempts");
            break;
        }
        }

        }
}
