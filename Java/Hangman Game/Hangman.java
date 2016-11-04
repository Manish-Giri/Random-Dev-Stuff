package javaObjs.HangmanGame;


import java.util.Random;

/**
 * Created by Manish on 10/20/2015.
 */
public class Hangman {

    private static String[] wordList = {"interpolation", "presidential", "dangerous", "cheerleader"};

    private static String randomWord(String[] list) {

        int wordListLength = list.length;
        Random random = new Random();
        int randomIndex = random.nextInt(wordListLength);
        String word = list[randomIndex];
        //test  check -
        //System.out.println("Secret: the word is: " + word);
        return word;
    }

    public static void main(String[] args) {

        Game game = new Game(randomWord(wordList));
        Prompter prompter = new Prompter(game);
        //System.out.println(game.applyGuess('t'));
        //prompter.displayProgress();
        prompter.play();

    }
}
