import java.util.Scanner;
import java.util.Random;

public class randomNumberGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randInt = random.nextInt(100) + 1;
        int guess;
        int difficulty;
        int maxChances = -1;
        int attempts = 0;
        boolean hasWon = false;


        System.out.println("Welcome to the Number Guessing Game!\nI'm thinking of a number between 1 and 100.\nYou have a limited number of chances to guess the correct number.");

        do {
            System.out.println("\nPlease select the difficulty level:\n1. Easy (10 chances)\n2. Medium (7 Chances)\n3. Hard (5 Chances)\n");
            difficulty = scanner.nextInt();


            if (difficulty == 1) {
                maxChances = 10;
                System.out.println("Great! You have selected the Easy difficulty level.\nLet's start the game!");
            } else if (difficulty == 2) {
                maxChances = 7;
                System.out.println("Great! You have selected the Medium difficulty level.\nLet's start the game!");
            } else if (difficulty == 3) {
                maxChances = 5;
                System.out.println("Great! You have selected the Hard difficulty level.\nLet's start the game!");
            } else {
                System.out.println("There are only 3 levels!!! Pick again!!!");
            }
        } while (difficulty < 1 || difficulty > 3);

        while (attempts < maxChances && !hasWon) {
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();
            if (guess > 100 || guess < 0) {
                System.out.println("THE NUMBER CAN ONLY BE IN BETWEEN 1-100!!!");
            } else if (guess == randInt) {
                attempts++;
                hasWon = true;
            } else if (randInt < guess) {
                attempts++;
                System.out.println("Incorrect! The number is less than " + guess +".");
            } else if (randInt > guess) {
                attempts++;
                System.out.println("Incorrect! The number is greater than " + guess + ".");




                //scanner.close();
            }
        }

        if(hasWon == true){
            System.out.println("Congratulations! You guessed the right number!");
        } else {
            System.out.println("Boo Hoo! You didn't get the right number cause you suck at guessing, it was " + randInt + "!");
        }
    }
}

