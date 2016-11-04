package javaObjs.HangmanGame;

import java.util.Scanner;

/**
 * Created by Manish on 10/20/2015.
 */
public class Prompter {

    private Game mGame;
    static Scanner scanner = new Scanner(System.in);

    public Prompter(Game game) {
        mGame = game;
    }

    public boolean promptForGuess() {
        boolean isHit = false;
        boolean isValidGuess = false;
        while (!isValidGuess) {

            System.out.println("Guess a letter:> \n");
            String guessAsString = scanner.nextLine();
            //char guess = guessAsString.charAt(0);
            try {
                isHit = mGame.applyGuess(guessAsString);
                isValidGuess = true;
            }
            catch (IllegalArgumentException e) {
                System.out.printf("%s. Please try again\n", e.getMessage());
            }
        }

        return isHit;

    }

    //display the current progress
    public void displayProgress() {
        System.out.printf("You have %d attempts left.\n", mGame.getRemainingAttempts());
        System.out.printf("Try to solve: %s\n", mGame.getCurrentProgress());
    }

    public void play() {
        while (mGame.getRemainingAttempts() > 0 && !mGame.isSolved()) {
            displayProgress();
            promptForGuess();

        }

        if(mGame.isSolved()) {
            System.out.printf("Congratulations! You did it with %d attempts left!", mGame.getRemainingAttempts());
        }

        else {
            System.out.printf("Bummer, the word was: %s\n", mGame.getAnswer());
        }
    }
}
